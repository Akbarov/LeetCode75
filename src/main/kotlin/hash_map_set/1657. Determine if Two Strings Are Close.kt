package hash_map_set

/**
Creator: Zohidjon Akbarov
 */
/**
 * Two strings are considered close if you can attain one from the other using the following operations:

Operation 1: Swap any two existing characters.
For example, abcde -> aecdb
Operation 2: Transform every occurrence of one existing character into another existing character, and do the same with the other character.
For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
You can use the operations on either string as many times as necessary.

Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.
 */

fun main() {
    print(closeStrings("abc", "bds"))
}

private fun closeStrings(word1: String, word2: String): Boolean {
    if (word1.length != word2.length) return false
    val first = IntArray(26)
    val second = IntArray(26)
    for (c in word1) {
        first[c - 'a']++
    }
    for (c in word2) {
        second[c - 'a']++
    }
    return first.sortedArray().contentEquals(second.sortedArray())
}