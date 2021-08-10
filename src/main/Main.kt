package main

import main.model.toListNode
import solutions.*

fun main() {
    val test = PalindromeLinkedList()
    val data1 = intArrayOf(1,2,2,1).toListNode()
    val data2 = intArrayOf(1).toListNode()
    val data3 = intArrayOf(1,2,3,2,1).toListNode()
    val data4 = intArrayOf(1,2,3,1).toListNode()

    println(test.isPalindrome2(data1))
    println(test.isPalindrome2(data2))
    println(test.isPalindrome2(data3))
    println(test.isPalindrome2(data4))

}