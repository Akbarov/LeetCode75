package stack

import java.util.*

/**
Creator: Zohidjon Akbarov
 */
/**
 * You are given a string s, which contains stars *.

In one operation, you can:

Choose a star in s.
Remove the closest non-star character to its left, as well as remove the star itself.
Return the string after all stars have been removed.

Note:

The input will be generated such that the operation is always possible.
It can be shown that the resulting string will always be unique.
 */
fun main() {
    println(removeStars("leet**cod*e"))
    println(removeStars2("leet**cod*e"))
}

private fun removeStars(s: String): String {
    val stack = Stack<Char>()
    for (c in s) {
        if (c == '*' && stack.isNotEmpty()) {
            stack.pop()
        } else stack.push(c)
    }
    val sb = StringBuilder()
    stack.forEach { sb.append(it) }
    return sb.toString().reversed()
}

private fun removeStars2(s: String): String {
    var slow = 0
    val chars = s.toCharArray()
    for (c in s) {
        if (c == '*') {
            slow--
        } else {
            chars[slow++] = c
        }
    }
    return chars.take(slow).joinToString("")
}