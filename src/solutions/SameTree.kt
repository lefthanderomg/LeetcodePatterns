package solutions

import main.model.TreeNode
import java.util.*

class SameTree {

    fun isSameTreeR(p: TreeNode?, q: TreeNode?): Boolean {
        if(p == null && q == null) {
            return true
        }
        if(p == null || q == null) {
            return false
        }
        if(p.`val` != q.`val`) {
            return false
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
    }

    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        val pQueue : Queue<TreeNode> = LinkedList()
        val qQueue : Queue<TreeNode> = LinkedList()

        p?.let(pQueue::offer)
        q?.let(qQueue::offer)

        while(pQueue.isNotEmpty() || qQueue.isNotEmpty()) {
            val pSize = pQueue.size
            val qSize = qQueue.size

            if(pSize != qSize) {
                return false
            }

            for(i in 0 until pSize) {
                val pTree = pQueue.poll()
                val qTree = qQueue.poll()

                if(pTree.`val` != qTree.`val`) {
                    return false
                }

                val pLeft = pTree?.left
                val pRight = pTree?.right

                val qLeft = qTree?.left
                val qRight = qTree?.right

                if(pLeft?.`val` != qLeft?.`val` || pRight?.`val` != qRight?.`val`) {
                    return false
                }

                pLeft?.let(pQueue::offer)
                pRight?.let(pQueue::offer)

                qLeft?.let(qQueue::offer)
                qRight?.let(qQueue::offer)

            }
        }

        return true
    }
}