package solutions

import main.model.TreeNode
import java.util.*
import kotlin.math.max

class DiameterBinaryTree {

    fun diameterOfBinaryTree(node: TreeNode?): Int {
        var diameter = 0

        fun longestPath(node: TreeNode?): Int {
            if (node == null) return 0
            val left = longestPath(node.left)
            val right = longestPath(node.right)

            diameter = max(diameter, left + right)

            return max(left, right) + 1

        }

        longestPath(node)

        return diameter
    }
}