package solutions

import main.model.TreeNode
import java.util.*

class PathSum {

    fun hasPathSum(node: TreeNode?, target: Int): Boolean {
        if (node == null) return false

        val stackTreeNode = Stack<TreeNode>()
        val stackSum = Stack<Int>()

        stackTreeNode.push(node)
        stackSum.push(target - node.`val`)

        while (stackTreeNode.isNotEmpty()) {
            val treeNode = stackTreeNode.pop()
            val sum = stackSum.pop()

            if (sum == 0 && treeNode.left == null && treeNode.right == null) {
                return true
            }

            treeNode?.right?.let {
                stackTreeNode.push(it)
                stackSum.push(sum - it.`val`)
            }

            treeNode?.left?.let {
                stackTreeNode.push(it)
                stackSum.push(sum - it.`val`)
            }
        }

        return false
    }

    fun hasPathSumRecursive(node: TreeNode?, target: Int): Boolean {
        if (node == null) return false

        val currentTarget = target - node.`val`
        return if (currentTarget == 0 && node.left == null && node.right == null) {
            true
        } else {
            hasPathSum(node.left, currentTarget) || hasPathSum(node.right, currentTarget)
        }
    }
}