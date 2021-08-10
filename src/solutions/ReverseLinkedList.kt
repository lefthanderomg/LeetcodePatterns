package solutions

import main.model.ListNode

class ReverseLinkedList {

    fun reverseList(head: ListNode?): ListNode? {
        var prev : ListNode? = null
        var current = head

        while (current != null) {
            val next = current.next
            current.next = prev
            prev = current
            current = next
        }

        return prev
    }
}