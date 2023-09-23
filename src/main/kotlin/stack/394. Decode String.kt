package stack

import java.util.*

/**
Creator: Zohidjon Akbarov
 */
/**
 * Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc.
Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].

The test cases are generated so that the length of the output will never exceed 105.


 */
fun main() {
    print(decodeString("3[a]2[b]"))
}

private fun decodeString(s: String): String {
    val stack = Stack<String>()
    val intStack = Stack<Int>()
    var result = ""
    var k = 0
    for (c in s) {
        when (c) {
            '[' -> {
                stack.push(result)
                intStack.push(k)
                result = ""
                k = 0
            }
            ']' -> {
                var prev = stack.pop()
                repeat(intStack.pop()) {
                    prev += result
                }
                result = prev
            }
            in '0'..'9' -> {
                k = 10 * k + (c - '0')
            }
            else -> {
                result += c
            }
        }
    }
    return result
}