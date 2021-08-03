package solutions

import kotlin.math.max

class MaximumSubArray {

    fun maxSubArray(nums: IntArray): Int {
        var max = nums[0]
        var currentMax = nums[0]

       for (i in 1 until nums.size) {
           val num = nums[i]

           currentMax = max(currentMax+ num, num)
           max = max(max, currentMax)
       }

        return max
    }
}