package linked_list

import GenerateListNode
import ListNode
import java.util.*
import kotlin.math.max

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    println(pairSum(GenerateListNode.generate(listOf(5, 4, 2, 1))))
}

private fun pairSum(head: ListNode?): Int {
    val stack = Stack<Int>()
    var count = 0
    var temp = head
    while (temp != null) {
        count++
        temp = temp.next
    }
    temp = head
    var result = Int.MIN_VALUE
    count /= 2
    while (temp != null) {
        if (count-- > 0) {
            stack.push(temp.`val`)
        } else {
            result = max(result, stack.pop() + temp.`val`)
        }
        temp = temp.next
    }
    return result
}