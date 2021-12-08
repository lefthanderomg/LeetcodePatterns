package book

class EuclideanAlgorithm {

    fun invoke(p: Int, q: Int): Int {
        if (q == 0) return p
        val r = p % q

        return invoke(q, r)
    }
}