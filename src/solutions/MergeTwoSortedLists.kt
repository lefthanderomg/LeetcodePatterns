package solutions

import main.model.ListNode

class MergeTwoSortedLists {

    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {

        var currentL1: ListNode? = l1
        var currentL2 = l2

        val result = ListNode(0)
        var currentResult: ListNode? =result


        while (currentL1 != null || currentL2 != null) {

            val valL1 = currentL1?.`val` ?: Int.MAX_VALUE
            val valL2 = currentL2?.`val` ?: Int.MAX_VALUE
            println("valL1 = $valL1, valL2 = $valL2")
            when {
                valL1 <= valL2 -> {
                    currentResult?.next = ListNode(currentL1!!.`val`)
                    currentResult = currentResult?.next
                    currentL1 = currentL1.next
                }
                valL1 > valL2 -> {
                    currentResult?.next = ListNode(currentL2!!.`val`)
                    currentResult = currentResult?.next
                    currentL2 = currentL2.next
                }
            }
        }

        return result.next
    }
}