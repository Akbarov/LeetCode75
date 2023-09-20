package two_pointers

/**
Creator: Zohidjon Akbarov
 */
/**
 * You are given an integer array nums and an integer k.

In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.

Return the maximum number of operations you can perform on the array.
 */
fun main() {

}

private fun maxOperations(nums: IntArray, k: Int): Int {
    var result = 0
    nums.sort()
    var left = 0
    var right = nums.lastIndex
    while (left < right) {
        val sum = nums[left] + nums[right]
        if (sum < k) left++
        else if (sum > k) right--
        else {
            result++
            right--
            left++
        }
    }
    return result

}