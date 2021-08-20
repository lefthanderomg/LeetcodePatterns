package solutions

import main.model.TreeNode
import java.util.*

fun main() {
    val data = TreeNode(1).apply {
        left = TreeNode(2).apply {
            left = TreeNode(2)
            right = TreeNode(2).apply {
                left = TreeNode(100)
            }
        }
        right = TreeNode(3).apply {
            left = TreeNode(3)
            right = TreeNode(3)
        }
    }

    MinDepth().minDepth(data)
}

class MinDepth {

    fun minDepth(root: TreeNode?): Int {
        val queue : Queue<TreeNode?> = LinkedList()
        queue.offer(root)
        var levels = 0

        while(queue.isNotEmpty()) {
            val size = queue.size

            for (i in 0 until size) {
                val item = queue.poll()
                val left = item?.left
                val right = item?.right

                left?.let(queue::offer)
                right?.let(queue::offer)

                if(left == null && right == null) {
                    return levels
                }
            }

            levels++
        }

        return 0
    }
}