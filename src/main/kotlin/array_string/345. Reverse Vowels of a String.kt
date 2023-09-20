package array_string

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    print(reverseVowels("leetcode"))
}

private fun reverseVowels(s: String): String {
    var left = 0
    var right = s.length - 1
    val chars = s.toCharArray()
    var set = setOf('u', 'a', 'e', 'i', 'o', 'U', 'A', 'E', 'I', 'O')
    while (left < right) {
        while (left < right && chars[left] !in set) left++
        while (left < right && chars[right] !in set) right--
        chars[left] = chars[right].also { chars[right] = chars[left] }
        left++
        right--
    }
    return chars.joinToString("")
}