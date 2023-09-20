/**
Creator: Zohidjon Akbarov
 */
/**
 * 1431. Kids With the Greatest Number of Candies
 * There are n kids with candies.
 * You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has,
 * and an integer extraCandies, denoting the number of extra candies that you have.
 * Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies,
 * they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.
 */
fun main() {
    println(kidsWithCandies(intArrayOf(2, 3, 5, 1, 3), 3))
}

private fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
    val big = candies.max() ?: 0
    val result = MutableList(candies.size) { false }
    for ((i, c) in candies.withIndex()) {
        if (c + extraCandies >= big) {
            result[i] = true
        }
    }
    return result
}