package book.chapter1.ProgrammingModel1_1

import utils.step

class BinaryString {

    fun invoke(n: Int): String {
        var result = ""

        for (i in n downTo 1 step { it / 2 }) {
            println("i = $i")
            result = (i % 2).toString() + result
        }

        return result
    }
}