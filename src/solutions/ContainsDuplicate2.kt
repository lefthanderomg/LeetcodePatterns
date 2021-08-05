package solutions

import kotlin.math.abs

class ContainsDuplicate2 {

    fun containsNearbyDuplicate1(nums: IntArray, k: Int): Boolean {
        nums.forEachIndexed { index, i ->
            var j = index - 1

            while (j >= 0) {
                if (abs(index - j) > k) {
                    j = -1
                    break
                }
                if (nums[j] == nums[index] && abs(index - j) <= k) {
                    return true
                }
                j--
            }
        }

        return false
    }

    fun slidingWindow(nums: IntArray, k: Int): Boolean {
        val set = mutableSetOf<Int>()

        nums.forEachIndexed { index, it ->
            if (!set.add(it)) {
                return true
            }

            if (set.size > k) {
                set.remove(nums[index - k])
            }
        }

        return false
    }


    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val map = mutableMapOf<Int, Int>()

        nums.forEachIndexed { index, i ->
            val currentIndex = map[i]
            if (currentIndex != null && k >= index - currentIndex) {
                return true
            } else {
                map[i] = index
            }
        }

        return false
    }
}
