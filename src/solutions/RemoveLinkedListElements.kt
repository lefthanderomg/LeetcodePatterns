package solutions

import main.model.ListNode

class RemoveLinkedListElements {

    fun removeElements1(head: ListNode?, `val`: Int): ListNode? {
        val newHead = ListNode(0)
        newHead.next = head

        var prev: ListNode? = null
        var current: ListNode? = newHead

        while(current != null) {
            val next = current.next

            if (current.`val` == `val`) {
                prev?.next = next
            } else {
                prev = current
            }

            current = next
        }

        return newHead.next
    }


    fun removeElements2(head: ListNode?, `val`: Int): ListNode? {
        var newHead = head

        while(newHead?.`val` == `val`) {
            newHead = newHead.next
        }


        var prev: ListNode? = null
        var current = newHead

        while(current != null) {
            val next = current.next

            if (current.`val` == `val`) {
                prev?.next = next
            } else {
                prev = current
            }

            current = next
        }

        return newHead
    }


}