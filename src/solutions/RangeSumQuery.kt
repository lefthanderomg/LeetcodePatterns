package solutions

class RangeSumQuery(val nums: IntArray) {

    val cacheSum = mutableListOf<Int>()

    init {
        var currentSum = 0
        nums.forEach {
            currentSum += it
            cacheSum.add(currentSum)
        }
    }

    fun sumRangeCachePerformances(left: Int, right: Int) = if (left == 0) {
        cacheSum[right]
    } else {
        cacheSum[right] - cacheSum[left]
    }

    fun sumRange(left: Int, right: Int): Int {
        var count = 0

        nums.forEachIndexed { index, i ->
            if (index in left..right) {
                count += i
            }
        }

        return count
    }

    fun sumRangeKotlinStyle(left: Int, right: Int) =
        nums.filterIndexed { index, _ -> index in left..right }.sum()
}