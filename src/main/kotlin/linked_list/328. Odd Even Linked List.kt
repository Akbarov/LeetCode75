package linked_list

import ListNode

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    println(oddEvenList(null))
}

private fun oddEvenList(head: ListNode?): ListNode? {
    val evenList = ListNode(0)
    val oddList = ListNode(0)
    var evenTemp: ListNode? = evenList
    var oddTemp: ListNode? = oddList
    var temp = head
    while (temp != null) {
        evenTemp?.next = temp
        evenTemp = evenTemp?.next
        oddTemp?.next = temp.next
        oddTemp = oddTemp?.next
        temp = temp.next?.next
    }
    evenTemp?.next = oddTemp
    return evenList.next
}