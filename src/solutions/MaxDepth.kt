package solutions

import main.model.TreeNode

class MaxDepth {

    fun maxDepth(root: TreeNode?): Int  = calculateDepth(root, 0)

    private fun calculateDepth(node: TreeNode?, count: Int): Int {
        if (node == null) {
            return count
        }
        val rightMax = calculateDepth(node.right, count + 1)
        val leftMax = calculateDepth(node.left, count + 1)

        return rightMax.coerceAtLeast(leftMax)
    }
}