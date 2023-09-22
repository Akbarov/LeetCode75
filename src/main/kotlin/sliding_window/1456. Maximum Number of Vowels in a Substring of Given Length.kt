package sliding_window

import kotlin.math.max

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    print(maxVowels("audnjkvbfi", 4))
}

private fun maxVowels(s: String, k: Int): Int {
    var left = 0
    var right = 0
    val vowels = setOf('a', 'e', 'u', 'i', 'o')
    var result = 0
    var count = 0
    while (right < s.length) {
        if (s[right] in vowels) count++
        if (right - left >= k) {
            if (s[left] in vowels) count--
            left++
        }
        result = max(result, count)
        right++
    }
    return result
}