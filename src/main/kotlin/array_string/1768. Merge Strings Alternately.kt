/**
Creator: Zohidjon Akbarov
 */
/**
 * 1768. Merge Strings Alternately
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
 * starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
 * Return the merged string.
 * */

fun main() {
    println(mergeAlternately("abc", "pqr"))
}

private fun mergeAlternately(word1: String, word2: String): String {
    val sb = StringBuilder()
    var i = 0
    while (i < word1.length || i < word2.length) {
        if (i < word1.length) sb.append(word1[i])
        if (i < word2.length) sb.append(word2[i])
        i++
    }
    return sb.toString()
}