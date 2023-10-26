package binary_tree_bfs

import GenerateTreeNode
import TreeNode
import java.util.*

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    print(rightSideView(GenerateTreeNode.generate(listOf(1, 2, 3, null, 5, null, 4))))
}

private fun rightSideView(root: TreeNode?): List<Int> {
    if (root == null) return emptyList()
    val queue: Queue<TreeNode> = LinkedList()
    queue.offer(root)
    val result = mutableListOf<Int>()
    while (queue.isNotEmpty()) {
        val size = queue.size
        repeat(size) { i ->
            val node = queue.poll()
            if (i == 0) {
                result.add(node.`val`)
            }
            node.right?.apply { queue.offer(this) }
            node.left?.apply { queue.offer(this) }
        }
    }
    return result
}