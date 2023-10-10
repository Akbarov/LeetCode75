package queue

import java.util.*

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    print(ping(1))
    print(ping(100))
    print(ping(3001))
    print(ping(3002))
}

private val q: Queue<Int> = LinkedList()
fun ping(t: Int): Int {
    q.offer(t)
    while (q.peek() < t - 3000) q.poll()
    return q.size
}