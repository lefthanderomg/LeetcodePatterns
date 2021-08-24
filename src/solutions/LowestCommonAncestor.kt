package solutions

import main.model.TreeNode

class LowestCommonAncestor {

    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        var current = root

        val qVal = q!!.`val`
        val pVal = p!!.`val`

        while(current != null) {
            val currentVal = current.`val`

            current = if(qVal > currentVal && pVal > currentVal) {
                current.right
            } else if (qVal < currentVal && pVal < currentVal) {
                current.left
            } else {
                return current
            }
        }

        return null
    }
}