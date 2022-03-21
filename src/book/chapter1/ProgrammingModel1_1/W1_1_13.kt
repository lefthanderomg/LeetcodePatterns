package book.chapter1.ProgrammingModel1_1

class W1_1_13 {

    fun invoke(n: Int, m: Int) {
        val size = n.coerceAtLeast(m)
        val array = Array(size) { IntArray(size) }

        for (i in 0 until n) {
            val inner = IntArray(size)
            for (l in 0 until m) {
                inner[l] = l
            }
            array[i] = inner
        }

        array.forEachIndexed { index, innerArray ->
            for (indexInner in index..innerArray.lastIndex) {
                val temp = array[index][indexInner]
                array[index][indexInner] = array[indexInner][index]
                array[indexInner][index] = temp
            }
        }
    }
}