package linked_list

import ListNode

/**
Creator: Zohidjon Akbarov
 */
fun main() {

}

private fun deleteMiddle(head: ListNode?): ListNode? {
    var fast = head
    var count = 0
    while (fast != null) {
        fast = fast.next
        count++
    }
    count = if (count % 2 == 1) count / 2 else count / 2 - 1
    var slow = head
    repeat(count) {
        slow = slow?.next
    }
    slow?.next = slow?.next?.next
    return head
}