package main

import solutions.*

fun main() {
    val test = ContainsDuplicate2()

    println(test.slidingWindow(intArrayOf(1,2,3,1), 3))

    println(test.slidingWindow(intArrayOf(1,2,3,1,2,3), 2))

}