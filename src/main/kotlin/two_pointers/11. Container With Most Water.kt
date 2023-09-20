package two_pointers

import kotlin.math.max
import kotlin.math.min

/**
Creator: Zohidjon Akbarov
 */
/**
 * 11. Container With Most Water
 * You are given an integer array height of length n.
 * There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.
 */
/**You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.
 * */

fun main() {
    println(maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))
}

private fun maxArea(height: IntArray): Int {
    var left = 0
    var right = height.lastIndex
    var result = 0
    while (left < right) {
        result = max(result, (right - left) * min(height[left], height[right]))
        if (height[left] < height[right]) left++
        else right--
    }
    return result
}