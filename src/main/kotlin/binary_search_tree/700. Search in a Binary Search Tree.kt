package binary_search_tree

import GenerateTreeNode
import TreeNode

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    println(searchBST(GenerateTreeNode.generate(listOf(4, 2, 7, 1, 3)), 2)?.`val`)
}

private fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
    if (root == null) return null
    return if (root.`val` > `val`) {
        searchBST(root.left, `val`)
    } else if (root.`val` < `val`) {
        searchBST(root.right, `val`)
    } else root
}