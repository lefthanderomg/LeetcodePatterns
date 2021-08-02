package solutions

class ClimbingStairs {

    fun climbStairs(n: Int): Int {
        var n1 = 0
        var n2 = 1

        for (i in 1..n) {
            val tempN2 = n2
            n2 += n1
            n1 = tempN2
        }

        return n2
    }
}