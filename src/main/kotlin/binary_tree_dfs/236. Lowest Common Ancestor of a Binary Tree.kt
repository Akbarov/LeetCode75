package binary_tree_dfs

import TreeNode

/**
Creator: Zohidjon Akbarov
 */
fun main() {

}

private var ans: TreeNode? = null
fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
    helper(root, p, q)
    return ans
}

private fun helper(root: TreeNode?, p: TreeNode?, q: TreeNode?): Boolean {
    if (root == null) return false

    val left = if (helper(root.left, p, q)) 1 else 0
    val right = if (helper(root.right, p, q)) 1 else 0
    val mid = if (root == p || root == q) 1 else 0

    if (mid + left + right >= 2) ans = root
    return mid + left + right > 0
}