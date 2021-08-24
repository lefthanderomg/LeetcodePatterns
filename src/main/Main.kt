package main

import main.model.TreeNode
import main.model.toListNode
import solutions.*

fun main() {
    val test = MaxDepth()
//    val data = TreeNode(1).apply {
//        left = TreeNode(2).apply {
//            left = TreeNode(4)
//            right = TreeNode(5)
//        }
//        right = TreeNode(3)
//    }

    val data1 = TreeNode(2).apply {
        left = TreeNode(3).apply {
            left = TreeNode(1)
            right = null
        }
    }

    val data2 = TreeNode(1).apply {
        left = TreeNode(2).apply {
            left = TreeNode(3).apply {
                left = TreeNode(5)
            }
            right = TreeNode(4).apply {
                left = TreeNode(6)
            }
        }
    }

    println(test.maxDepth(data2 ))
}