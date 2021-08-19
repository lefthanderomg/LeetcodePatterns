package solutions

class NextGreatestLetter {

    fun nextGreatestLetter(letters: CharArray, target: Char): Char {
        var start = 0
        var end = letters.size

        while (start < end) {
            val middle = start + ((end - start) / 2)
            if (target >= letters[middle]) {
                start = middle + 1
            } else {
                end = middle
            }

        }
        return letters[start % letters.size]
    }
}