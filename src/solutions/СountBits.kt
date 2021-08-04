package solutions

class СountBits {

    fun countBitsCancel(n: Int): IntArray {
        val result = IntArray(n + 1)

        for (i in 0..n) {
            val binary = i.countOneBits()
            result[i] = binary
        }

        return result
    }

    fun countBits(n: Int): IntArray {
        val result = IntArray(n + 1) { 0 }
        for (i in 0..n) {
            val binary = i.toString(2)
            result[i] = binary.filter { it == '1' }.length
        }

        return result
    }
}