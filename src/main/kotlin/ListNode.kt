class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

object GenerateListNode {
    fun generate(list: List<Int>?): ListNode? {
        if (list.isNullOrEmpty()) return null
        val head = ListNode(0)
        var temp: ListNode? = head
        list.forEach {
            temp?.next = ListNode(it)
            temp = temp?.next
        }
        return head.next
    }
}
