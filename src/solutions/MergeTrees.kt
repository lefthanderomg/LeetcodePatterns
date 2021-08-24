package solutions

import main.model.TreeNode
import java.util.*

class MergeTrees {

    fun mergeTreesRecursive(node1: TreeNode?, node2: TreeNode?): TreeNode? {
        if (node1 == null) {
            return node2
        }
        if (node2 == null) {
            return node1
        }

        node1.`val` += node2.`val`

        node1.left = mergeTreesRecursive(node1.left, node2.left)
        node1.right = mergeTreesRecursive(node1.right, node2.right)

        return node1
    }

    fun mergeTrees(root1: TreeNode?, root2: TreeNode?): TreeNode? {
        if (root1 == null && root2 == null) {
            return null
        } else if (root1 == null) {
            return root2
        } else if (root2 == null) {
            return root1
        }

        val stackRoot1 = Stack<TreeNode>().apply {
            push(root1)
        }
        val stackRoot2 = Stack<TreeNode>().apply {
            push(root2)
        }

        while (stackRoot1.isNotEmpty() && stackRoot2.isNotEmpty()) {
            val node1 = stackRoot1.pop()
            val node2 = stackRoot2.pop()

            node1.`val` += node2.`val`

            node1?.right?.let(stackRoot1::push)
            node2?.right?.let(stackRoot2::push)

            if (node1.right == null && node2.right != null) {
                val tempNode = TreeNode(0)
                node1.right = tempNode
                stackRoot1.push(tempNode)
            } else if (node1.right != null && node2.right == null) {
                val tempNode = TreeNode(0)
                node2.right = tempNode
                stackRoot2.push(tempNode)
            }

            node1?.left?.let(stackRoot1::push)
            node2?.left?.let(stackRoot2::push)

            if (node1.left == null && node2.left != null) {
                val tempNode = TreeNode(0)
                node1.left = tempNode
                stackRoot1.push(tempNode)
            } else if (node1.left != null && node2.left == null) {
                val tempNode = TreeNode(0)
                node2.left = tempNode
                stackRoot2.push(tempNode)
            }
        }

        return root1
    }
}