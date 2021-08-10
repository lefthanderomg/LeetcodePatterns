package solutions

import main.model.ListNode

class MiddleLinkedList {

    fun middleNode1(head: ListNode?): ListNode? {
        var count = 0
        var current = head

        while (current != null) {
            current = current.next
            count++
        }

        val center = count / 2 + 1
        var currentCenter: ListNode? = head
        var countCenter = 1

        while (countCenter < center) {
            countCenter++
            currentCenter = currentCenter?.next

        }

        return currentCenter
    }

    fun middleNode2(head: ListNode?): ListNode? {
        var slow = head
        var fast = head

        while (fast?.next != null) {
            slow = slow?.next
            fast = fast.next?.next
        }

        return slow
    }
}