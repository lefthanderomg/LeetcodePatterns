package main

import solutions.*

fun main() {
    val test = HasCycle()
    val cycler = HasCycle.ListNode(2)
    val data = HasCycle.ListNode(3).apply {
        next = cycler.apply {
            next = HasCycle.ListNode(0).apply {
                next = HasCycle.ListNode(-4).apply {
                    next = cycler
                }
            }
        }
    }
    print(test.hasCycle(data))
    val kek = HasCycle.ListNode(2)
    println(test.hasCycle(kek.apply {
        next = HasCycle.ListNode(5)
    }))


}