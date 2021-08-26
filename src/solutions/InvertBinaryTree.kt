package solutions

import main.model.TreeNode

class InvertBinaryTree {

    fun invertTree(node: TreeNode?): TreeNode? {
        if(node == null) return null

        val temp = node.right

        node.right = node.left
        node.left = temp

        invertTree(node.left)
        invertTree(node.right)

        return node
    }

    fun test(): IntArray =  intArrayOf(1,2)
}