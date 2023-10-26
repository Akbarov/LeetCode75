package binary_tree_dfs

import GenerateTreeNode
import TreeNode
import kotlin.math.max

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    println(goodNodes(GenerateTreeNode.generate(listOf(3,1,4,1,5))))
}

private var totalGoodNodes = 0
private fun goodNodes(root: TreeNode?): Int {
    if (root == null) return totalGoodNodes
    dfs(root, root.`val`)
    return totalGoodNodes
}

private fun dfs(root: TreeNode?, currentMax: Int) {
    if (root == null) return
    if (root.`val` >= currentMax) totalGoodNodes++
    dfs(root.left, max(currentMax, root.`val`))
    dfs(root.right, max(currentMax, root.`val`))
}