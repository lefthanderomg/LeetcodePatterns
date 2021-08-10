package solutions

import main.model.ListNode

class PalindromeLinkedList {

    fun isPalindrome(head: ListNode?): Boolean {
        var lastIndex = 0

        var current: ListNode? = head


        while (current != null) {
            val temp = current.next
            if (temp != null) {
                current = temp
                lastIndex++
            } else {
                current = null
            }
        }


        fun getCurrentEnd(): ListNode? {
            var counter = lastIndex
            var currentEnd = head
            while (counter >= 1) {
                currentEnd = currentEnd?.next
                counter--
            }
            lastIndex--

            return currentEnd
        }

        var currentStart = head
        var currentEnd = getCurrentEnd()
        while (currentStart?.`val` == currentEnd?.`val`) {
            currentStart = currentStart?.next
            currentEnd = getCurrentEnd()

            if (currentStart == null) {
                return true
            } else if (currentStart.`val` != currentEnd?.`val`) {
                return false
            }


        }

        return false
    }

    fun isPalindrome2(head: ListNode?): Boolean {
        val reverseLinkedList = ReverseLinkedList()
        val middleLinkedList = MiddleLinkedList()

        val middle = middleLinkedList.middleNode2(head)
        var revers = reverseLinkedList.reverseList(middle)
        var current = head

        while (revers != null) {
            if (current?.`val` != revers.`val`) {
                return false
            }
            revers = revers.next
            current = current.next
        }

        return true
    }

}