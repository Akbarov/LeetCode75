package array_string

/**
Creator: Zohidjon Akbarov
 */
/**
 * 605. Can Place Flowers
 * You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n,
 * return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
 */
fun main() {

}

private fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
    var count = 0
    for (i in flowerbed.indices) {
        if (flowerbed[i] == 0) {
            if (i > 0 && flowerbed[i - 1] == 1) continue
            if (i < flowerbed.size - 1 && flowerbed[i + 1] == 1) continue
            flowerbed[i] = 1
            count++
            if (count >= n) return true
        }
    }
    return count >= n
}