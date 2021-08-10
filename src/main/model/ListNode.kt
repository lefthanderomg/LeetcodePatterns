package main.model

data class ListNode(var `val`: Int, var next: ListNode? = null)


fun IntArray.toListNode(): ListNode? {
    val first = firstOrNull() ?: return null

    val head = ListNode(`val` = first)
    var current: ListNode? = head

    for (i in 1 until size) {
        val temp = ListNode(this[i])

        current?.next = temp
        current = temp
    }

    return head
}