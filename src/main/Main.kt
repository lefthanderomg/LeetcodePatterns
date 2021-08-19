package main

import main.model.toListNode
import solutions.*

fun main() {
val test = BinarySearch()
    println(test.search(intArrayOf(-1,0,3,5,9,12), 2))
    println(test.search(intArrayOf(-1,0,3,5,9,12), -1))
    println(test.search(intArrayOf(-1,0,3,5,9,12), 40))
    println(test.search(intArrayOf(-1,0,3,5,9,12), 12))
    println(test.search(intArrayOf(-1,0,3,5,9,12), 0))
    println(test.search(intArrayOf(-1,0,3,5,9,12), 9))
    println(test.search(intArrayOf(5), 5))

}