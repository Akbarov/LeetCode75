package sliding_window

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    print(longestSubarray(intArrayOf(1, 1, 0, 1, 0)))
}

private fun longestSubarray(nums: IntArray): Int {
    var i = 0
    var k = 1
    for (item in nums) {
        if (item == 0) {
            k--
        }
        if (k < 0 && nums[i++] == 0) {
            k++
        }
    }
    return nums.size - i - 1
}