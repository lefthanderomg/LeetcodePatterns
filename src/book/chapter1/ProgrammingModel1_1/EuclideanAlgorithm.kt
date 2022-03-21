package book.chapter1.ProgrammingModel1_1

class EuclideanAlgorithm {

    fun invoke(p: Int, q: Int): Int {
        if (q == 0) return p
        val r = p % q

        return invoke(q, r)
    }
}