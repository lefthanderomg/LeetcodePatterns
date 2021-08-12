package solutions

import main.model.ListNode

class RemoveDuplicatesFromSortedList {

    fun deleteDuplicates(head: ListNode?): ListNode? {

        var current: ListNode? = head

        while(current != null) {
            val next = current.next

            if(next?.`val` == current.`val`) {
                current.next = current.next?.next
            } else{
                current = next
            }

        }

        return head
    }
}