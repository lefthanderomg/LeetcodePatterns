package solutions

import main.model.TreeNode
import java.util.*

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