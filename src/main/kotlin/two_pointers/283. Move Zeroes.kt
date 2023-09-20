package two_pointers

/**
Creator: Zohidjon Akbarov
 */

fun main() {
    println(moveZeroes(intArrayOf(0, 1, 0, 0, 2)))
}

private fun moveZeroes(nums: IntArray) {
    var left = 0
    var right = 0
    while (right < nums.size) {
        if (nums[right] != 0) {
            nums[left] = nums[right].also { nums[right++] = nums[left++] }
        } else right++
    }
    println(nums.joinToString())
}
