package two_pointers

/**
Creator: Zohidjon Akbarov
 */
/**
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string
that is formed from the original string by deleting some (can be none) of the characters without disturbing
the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */
fun main() {
    println(isSubsequence("abc", "ahbgdc"))
}

private fun isSubsequence(s: String, t: String): Boolean {
    var left = 0
    for (c in t) {
        if (left < s.length && c == s[left]) left++
    }
    return left == s.length
}