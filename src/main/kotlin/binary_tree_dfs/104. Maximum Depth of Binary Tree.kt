package binary_tree_dfs

import GenerateTreeNode
import TreeNode
import kotlin.math.max


/**
Creator: Zohidjon Akbarov
 */
/**
 * Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */

fun main() {
    println(maxDepth(GenerateTreeNode.generate(listOf(3, 9, 20, null, null, 15, 7))))
}

private fun maxDepth(root: TreeNode?): Int {
    if (root == null) return 0
    return max(maxDepth(root.left), maxDepth(root.right)) + 1
}