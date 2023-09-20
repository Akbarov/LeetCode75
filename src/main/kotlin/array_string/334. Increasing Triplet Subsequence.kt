package array_string

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    println(increasingTriplet(intArrayOf(1, 2, 3, 4, 5)))
}

private fun increasingTriplet(nums: IntArray): Boolean {
    var small = Int.MAX_VALUE
    var big = Int.MAX_VALUE
    for (n in nums) {
        if (n <= small) small = n
        else if (n <= big) big = n
        else return true
    }
    return false
}