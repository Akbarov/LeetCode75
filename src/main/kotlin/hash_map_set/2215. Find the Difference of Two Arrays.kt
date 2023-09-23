package hash_map_set

/**
Creator: Zohidjon Akbarov
 */
/**
 * Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
Note that the integers in the lists may be returned in any order.
 */
fun main() {

}

private fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
    return listOf((nums1.toSet() subtract nums2.toSet()).toList(), (nums2.toSet() subtract nums1.toSet()).toList())
}