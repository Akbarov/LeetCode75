package array_string

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    print(reverseWords("the sky is blue"))
}

private fun reverseWords(s: String): String {
    return s.split(" ").filter { it.isNotBlank() }.reversed().joinToString(" ")
}