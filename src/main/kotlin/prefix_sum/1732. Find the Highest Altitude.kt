package prefix_sum

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    println(largestAltitude(intArrayOf(-5, 1, 5, 0, -7)))
}

private fun largestAltitude(gain: IntArray): Int {
    var result = 0
    var al = 0
    for (item in gain) {
        al += item
        result = result.coerceAtLeast(al)
    }
    return result
}