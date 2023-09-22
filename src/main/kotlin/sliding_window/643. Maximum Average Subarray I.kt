package sliding_window

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    print(findMaxAverage(intArrayOf(-1), 1))
}

fun findMaxAverage(nums: IntArray, k: Int): Double {
    var maxAv = -10000000.0
    var sum = 0.0
    for (i in nums.indices) {
        sum += nums[i]
        if (i + 1 >= k) {
            if (sum / k > maxAv) {
                maxAv = sum / k
            }
            sum -= nums[1 + i - k]
        }
    }
    return maxAv
}