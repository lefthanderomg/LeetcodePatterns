package solutions

class BinarySearch {

    fun search(nums: IntArray, target: Int): Int {
        var mid = 0
        var start = 0
        var end = nums.size - 1

        while (start <= end) {
            mid = start + ((end - start) / 2)
            val value = nums[mid]

            if (value== target) {
                return mid
            }

            if (target > value) {
                start = mid + 1
            } else {
                end = mid - 1
            }
        }

        return -1
    }
}