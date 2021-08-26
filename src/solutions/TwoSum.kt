package solutions

class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = intArrayOf(0,0)
        val map = mutableMapOf<Int,Int>()

        nums.forEachIndexed {index, item ->
            val diff = target - item

            map[diff]?.let {
                result[0] = index
                result[1] = it
                return result
            }

            map[item] = index
        }

        return result
    }
}