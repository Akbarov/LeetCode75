package queue

import java.util.*

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    print(predictPartyVictory("RDD"))
}

private fun predictPartyVictory(senate: String): String {
    val rQ = LinkedList<Int>()
    val dQ = LinkedList<Int>()

    for (i in senate.indices) {
        (if (senate[i] == 'R') rQ else dQ).addLast(i)
    }

    while (!dQ.isEmpty() && !rQ.isEmpty()) {
        val voterQ = if (dQ.first < rQ.first) dQ else rQ
        voterQ.addLast(maxOf(dQ.last, rQ.last) + 1)
        dQ.removeFirst()
        rQ.removeFirst()
    }

    return if (rQ.isEmpty()) "Dire" else "Radiant"
}