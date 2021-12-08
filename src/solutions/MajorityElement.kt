package solutions

class MajorityElement {

    fun majorityElement(nums: IntArray): Int {
        if (nums.isEmpty()) return -1
        nums.sort()

        var result = nums.first()

        var max = 0
        var count = 0
        var prev = nums.first()

        nums.forEachIndexed { index, it ->
            if (prev == it) count++
            if (prev != it || nums.lastIndex == index) {
                if (max < count) {
                    max = count
                    count = 1
                    result = prev
                }
                prev = it
            }

        }

        return result
    }

    fun majorityElement2(nums: IntArray): Int {
        nums.sort()

        return nums[nums.lastIndex / 2]
    }
}