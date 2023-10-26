package binary_tree_dfs

import GenerateTreeNode
import TreeNode
import kotlin.math.max

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    print(longestZigZag(GenerateTreeNode.generate(listOf(1, 1, 1, null, 1, null, null, 1, 1, null, 1))))
}

private var longestPath = 0
private fun longestZigZag(root: TreeNode?): Int {
    if (root == null) return 0
    dfs(root, 0, true)
    dfs(root, 0, false)
    return longestPath
}

private fun dfs(root: TreeNode?, path: Int, isRight: Boolean) {
    if (root == null) return
    longestPath = max(path, longestPath)
    if (isRight) {
        dfs(root.right, path + 1, false)
        dfs(root.left, 1, true)
    } else {
        dfs(root.right, 1, false)
        dfs(root.left, path + 1, true)
    }
}