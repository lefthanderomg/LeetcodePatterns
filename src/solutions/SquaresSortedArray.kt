package solutions

class SquaresSortedArray {

    fun sortedSquares(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        var leftIndex = 0
        var rightIndex = result.lastIndex

        for (i in nums.lastIndex downTo 0) {
            val left = nums[leftIndex] * nums[leftIndex]
            val right = nums[rightIndex] * nums[rightIndex]
            if (left > right) {
                result[i] = left
                leftIndex++
            }  else {
                result[i] = right
                rightIndex--
            }
        }

        return result
    }
}