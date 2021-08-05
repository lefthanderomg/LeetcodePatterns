package solutions

class FindAllDuplicates {


    fun findDuplicates(nums: IntArray): List<Int> {

        var i = 0
        while (i < nums.size) {
            val correctPosition = nums[i] - 1

            if (nums[correctPosition] != nums[i]) {
                val temp = nums[correctPosition]
                nums[correctPosition] = nums[i]
                nums[i] = temp
            } else {
                i++
            }
        }

        val result = mutableListOf<Int>()

        nums.forEachIndexed { index, item ->
            if (item != index + 1) {
                result.add(item)
            }
        }

        return result
    }
}