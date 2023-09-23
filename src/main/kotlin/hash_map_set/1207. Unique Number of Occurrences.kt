package hash_map_set

/**
Creator: Zohidjon Akbarov
 */
/**
 * Given an array of integers arr,
 * return true if the number of occurrences of each value in the array is unique
 * or false otherwise.
 */
fun main() {
    print(uniqueOccurrences(intArrayOf(1, 1, 2, 3, 4, 4, 4, 3, 3, 3)))
}

private fun uniqueOccurrences(arr: IntArray): Boolean {
    val map = mutableMapOf<Int, Int>()
    for (item in arr) {
        map[item] = (map[item] ?: 0) + 1
    }
    return map.values.size == map.values.toSet().size
}