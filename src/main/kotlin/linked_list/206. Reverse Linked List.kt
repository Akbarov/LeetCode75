package linked_list

import ListNode
import java.util.*

/**
Creator: Zohidjon Akbarov
 */
fun main() {

}

private fun reverseList(head: ListNode?): ListNode? {
    val stack = Stack<ListNode>()
    if (head?.next == null) return head
    val result = ListNode(0)
    var temp = head
    while (temp != null) {
        stack.push(temp)
        temp = temp.next
    }
    temp = result
    while (stack.isNotEmpty()) {
        temp?.next = stack.pop()
        temp = temp?.next
    }
    temp?.next = null
    return result.next
}

private fun reverseList2(head: ListNode?): ListNode? {
    var prev: ListNode? = null
    var curr = head
    var next: ListNode?
    while (curr != null) {
        next = curr.next
        curr.next = prev
        prev = curr
        curr = next
    }
    return prev
}