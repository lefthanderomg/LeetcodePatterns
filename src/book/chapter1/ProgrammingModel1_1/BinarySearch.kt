package book.chapter1.ProgrammingModel1_1

class BinarySearch {

    fun rank(key: Int, a: IntArray): Int = rank(key, a, 0, a.lastIndex)

    //3. Рекусивный вызов не должен ждать другой рекусивный вызов
    private fun rank(key: Int, a: IntArray, low: Int, high: Int): Int {
        if (low > high) return -1 // 1. Базовый return

        val mid = low + (high - low) / 2

        return when {
            //2. Схождения рекусивных вызовов (разность high - low  постоянно уменьшается)
            key < a[mid] -> rank(key, a, low, mid - 1)
            key > a[mid] -> rank(key, a, mid + 1, high)
            else -> mid
        }
    }
}