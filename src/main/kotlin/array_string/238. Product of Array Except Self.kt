package array_string

/**
Creator: Zohidjon Akbarov
 */
/**
 * 238. Product of Array Except Self
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.
 */

fun main() {
    println(productExceptSelf(intArrayOf(1, 2, 3, 4)))
}

private fun productExceptSelf(nums: IntArray): IntArray {
    val n = nums.size
    val result = IntArray(n)
    val leftP = IntArray(nums.size)
    val rightP = IntArray(nums.size)
    leftP[0] = nums[0]
    rightP[n - 1] = nums[n - 1]
    for (i in 1 until n - 1) {
        leftP[i] = leftP[i - 1] * nums[i]
        if (nums[i] == 0) break
    }
    for (i in n - 2 downTo 1) {
        rightP[i] = rightP[i + 1] * nums[i]
        if (nums[i] == 0) break
    }
    for (i in 0 until n) {
        val left = if (i > 0) leftP[i - 1] else 1
        val right = if (i < n - 1) rightP[i + 1] else 1
        result[i] = left * right
    }
    return result
}