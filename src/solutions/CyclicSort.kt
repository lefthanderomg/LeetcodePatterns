package solutions

class CyclicSort {

    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        var i = 0
        while (i < nums.size) {
            val correctPosition = nums[i] - 1
            if (nums[i] != nums[correctPosition]) {
                val cache = nums[correctPosition]

                nums[correctPosition] = nums[i]
                nums[i] = cache

            } else {
                i++
            }
        }
        val miss = mutableListOf<Int>()
        nums.forEachIndexed { index, j ->
            if (index + 1 != j) {
                miss.add(index + 1)
            }
        }

        return miss
    }
}