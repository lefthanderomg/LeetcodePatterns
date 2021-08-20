package solutions

import main.model.TreeNode
import java.util.*

class AverageOfLevels {

    fun averageOfLevels(root: TreeNode?): DoubleArray {
        val list = mutableListOf<Double>()
        val queue: Queue<TreeNode?> = LinkedList()
        queue.offer(root)

        while (queue.isNotEmpty()) {
            var levelSum = 0.0
            val size = queue.size
            for (i in 0 until size) {
                val item = queue.poll()
                levelSum += item?.`val` ?: 0

                item?.left?.let(queue::offer)
                item?.right?.let(queue::offer)
            }

            list.add(levelSum / size)
        }

        return list.toDoubleArray()
    }
}