import java.util.*

/**
Creator: Zohidjon Akbarov
 */
class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

object GenerateTreeNode {
    fun generate(list: List<Int?>?): TreeNode? {
        if (list.isNullOrEmpty()) return null
        var index = 0
        if (list[index] == null) return null
        val head = TreeNode(list[index++] ?: 0)
        val queue: Queue<TreeNode> = LinkedList()
        queue.offer(head)
        while (index < list.size) {
            val current = queue.poll()
            list[index++]?.apply {
                current.left = TreeNode(this)
                queue.offer(current.left)
            }
            if (index < list.size)
                list[index++]?.apply {
                    current.right = TreeNode(this)
                    queue.offer(current.right)
                }
        }
        return head
    }
}