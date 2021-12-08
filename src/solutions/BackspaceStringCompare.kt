package solutions

class BackspaceStringCompare {

    fun backspaceCompare(s: String, t: String): Boolean {
        var indexS = s.length - 1
        var indexT = t.length - 1

        while (indexS >= 0 || indexT >= 0) {
            indexS = getChar(s, indexS)
            indexT = getChar(t, indexT)

            val currentS = if (indexS < 0) ' ' else s[indexS]
            val currentT = if (indexT < 0) ' ' else t[indexT]

            println("currentS = $currentS")
            println("currentT = $currentT")

            if (currentS != currentT) {
                return false
            }

            indexS--
            indexT--
        }

        return true
    }

    private fun getChar(s: String, index: Int): Int {
        var skipCount = 0
        var currentIndex = index
        while (currentIndex >= 0) {
            when {
                s[currentIndex] == '#' -> {
                    skipCount++
                }
                skipCount > 0 -> {
                    skipCount--
                }
                else -> {
                    return currentIndex
                }
            }

            currentIndex--
        }

        return currentIndex
    }
}