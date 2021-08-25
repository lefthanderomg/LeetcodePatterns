package solutions

import main.model.TreeNode
import java.util.*

class Subtree {

    private val sameTree = SameTree()

    fun isSubtree(node: TreeNode?, subRoot: TreeNode?): Boolean {
        if (node == null || subRoot == null) return false

        val left = isSubtree(node.left, subRoot)
        val right = isSubtree(node.right, subRoot)

        return sameTree.isSameTree(node, subRoot) || left || right
    }
}