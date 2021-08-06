package solutions

class FindTheDuplicateNumber {

    fun findDuplicate(nums: IntArray): Int {
        var slow = nums[0];
        var fast = nums[0];
        do {
            slow = nums[slow]
            fast = nums[nums[fast]]
        } while (slow != fast)

        slow = nums[0]

        while (fast != slow) {
            fast = nums[fast]
            slow = nums[slow]
        }

        return slow
    }

}