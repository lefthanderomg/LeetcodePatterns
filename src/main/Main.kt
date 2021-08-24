package main

import main.model.TreeNode
import main.model.toListNode
import solutions.*

fun main() {
    val test = DiameterBinaryTree()
//    val data = TreeNode(1).apply {
//        left = TreeNode(2).apply {
//            left = TreeNode(4)
//            right = TreeNode(5)
//        }
//        right = TreeNode(3)
//    }

//    val data = TreeNode(2).apply {
//        left = TreeNode(3).apply {
//            left = TreeNode(1)
//            right = null
//        }
//    }

    val data = TreeNode(1).apply {
        left = TreeNode(2).apply {
            left = TreeNode(3).apply {
                left = TreeNode(5)
            }
            right = TreeNode(4).apply {
                left = TreeNode(6)
            }
        }
    }

    println(test.diameterOfBinaryTree(data))
}