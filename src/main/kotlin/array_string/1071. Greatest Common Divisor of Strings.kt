/**
Creator: Zohidjon Akbarov
 */
/**
 *1071. Greatest Common Divisor of Strings
 * For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
 *Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 * */

fun main() {
    println(gcdOfStrings("ABCABC", "ABC"))
}

private fun gcdOfStrings(str1: String, str2: String): String {
    if (str1 + str2 != str2 + str1) return ""
    val gcd = gcd(str1.length, str2.length)
    return str2.substring(0, gcd)
}

private fun gcd(p: Int, q: Int): Int {
    return if (q == 0) p else gcd(q, p % q)
}