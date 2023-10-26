package binary_tree_dfs

import GenerateTreeNode
import TreeNode

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    print(
        leafSimilar(
            GenerateTreeNode.generate(listOf(3, 5, 1, 6, 2, 9, 8, null, null, 7, 4)),
            GenerateTreeNode.generate(listOf(3, 5, 1, 6, 7, 4, 2, null, null, null, null, null, null, 9, 8))
        )
    )
}

private fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
    val firstList = mutableListOf<Int>()
    val secondList = mutableListOf<Int>()
    getLeafs(firstList, root1)
    getLeafs(secondList, root2)
    if (firstList.size != secondList.size) return false
    for (i in firstList.indices) {
        if (firstList[i] != secondList[i]) return false
    }
    return true
}

private fun getLeafs(list: MutableList<Int>, root: TreeNode?) {
    if (root == null) return
    if (root.left == null && root.right == null) {
        list.add(root.`val`)
        return
    }
    getLeafs(list, root.left)
    getLeafs(list, root.right)
}