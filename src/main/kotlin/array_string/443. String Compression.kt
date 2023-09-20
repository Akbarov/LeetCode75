package array_string

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    println(compress(charArrayOf('a', 'a', 'b', 'b', 'b')))
}

private fun compress(chars: CharArray): Int {
    var left = 0
    if (chars.size == 1) return 1
    println(chars)
    var last = 0
    for (i in 0 until chars.lastIndex) {
        if (chars[i] != chars[i + 1]) {
            val dif = i - last + 1
            chars[left++] = chars[i]
            last = i + 1
            if (dif > 1) {
                for (c in dif.toString()) {
                    chars[left++] = c
                }
            }
        }
    }
    val n = chars.lastIndex
    if (chars[n - 1] == chars[n]) {
        val dif = n - last + 1
        chars[left++] = chars[n]
        if (dif > 1) {
            for (c in dif.toString()) {
                chars[left++] = c
            }
        }
    } else {
        chars[left++] = chars[n]
    }
    return left
}