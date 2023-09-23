package stack

import java.util.*
import kotlin.math.abs

/**
Creator: Zohidjon Akbarov
 */
/**
 * We are given an array asteroids of integers representing asteroids in a row.

For each asteroid, the absolute value represents its size,
and the sign represents its direction (positive meaning right,
negative meaning left). Each asteroid moves at the same speed.

Find out the state of the asteroids after all collisions.
If two asteroids meet, the smaller one will explode.
If both are the same size, both will explode.
Two asteroids moving in the same direction will never meet.


 */
fun main() {
    print(asteroidCollision(intArrayOf(-2, -1, 1, 2)).joinToString())
    print(asteroidCollision(intArrayOf(5, 10, -5)).joinToString())
}

private fun asteroidCollision(asteroids: IntArray): IntArray {
    val stack = Stack<Int>()
    for (item in asteroids) {
        if (item < 0) {
            var broken = false
            while (stack.isNotEmpty() && stack.peek() > 0) {
                if (stack.peek() >= abs(item)) {
                    if (stack.peek() == abs(item)) stack.pop()
                    broken = true
                    break
                } else {
                    stack.pop()
                }
            }
            if (!broken) stack.push(item)
        } else {
            stack.push(item)
        }
    }
    val mutableList = mutableListOf<Int>()
    stack.forEach { mutableList.add(it) }
    return mutableList.toIntArray()
}