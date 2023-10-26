package binary_tree_bfs

import TreeNode
import java.util.*

/**
Creator: Zohidjon Akbarov
 */
fun main() {

}

private fun maxLevelSum(root: TreeNode?): Int {
    var level = 0
    var sumMax = Int.MIN_VALUE
    val queue: Queue<TreeNode> = LinkedList()
    if (root == null) return 0
    queue.offer(root)
    var index = 0
    while (queue.isNotEmpty()) {
        index++
        val size = queue.size
        var currentSum = 0
        repeat(size) {
            val node = queue.poll()
            currentSum += node.`val`
            node.left?.apply { queue.offer(this) }
            node.right?.apply { queue.offer(this) }
        }
        if (currentSum > sumMax) {
            sumMax = currentSum
            level = index
        }
    }
    return level
}