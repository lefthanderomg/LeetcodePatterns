package solutions

class MissingNumber {
    fun missingNumber(nums: IntArray): Int {
        val a1 = 1
        val an = nums.size
        val n = nums.size

        val result = ((a1 + an) * n)/2

        return result - nums.sum()
    }
}