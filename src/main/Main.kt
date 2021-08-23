package main

import main.model.TreeNode
import main.model.toListNode
import solutions.*

fun main() {
    val test = PathSum()
    val data = TreeNode(1).apply {
        left = TreeNode(2).apply {
            left = TreeNode(3)
            right = TreeNode(4).apply {
                left = TreeNode(5)
            }
        }
        right = TreeNode(6)
    }

    test.hasPathSum(data,0)
}