package main

import solutions.MajorityElement

fun main() {
   MajorityElement().majorityElement2(intArrayOf(2,2,1,1,1,2,2)).let(::println)
   MajorityElement().majorityElement2(intArrayOf(3,3,4)).let(::println)

}