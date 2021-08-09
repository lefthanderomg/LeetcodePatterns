package solutions

import main.model.ListNode
import java.lang.Exception
import kotlin.math.absoluteValue

class HasCycle {

    fun badHasCycle(head: ListNode?): Boolean = head?.let {
        val next = it.next

        try {
            badHasCycle(next)
        } catch (e: StackOverflowError) {
            true
        }

    } ?: false


    fun hasCycle(head: ListNode?): Boolean {
        if (head == null) return false
        var fast: ListNode? = head.next
        var slow: ListNode? = head

        while (fast != slow) {
            slow = slow?.next
            fast = fast?.next?.next


            if (slow == null) {
                return false
            }
        }

        return true
    }
}