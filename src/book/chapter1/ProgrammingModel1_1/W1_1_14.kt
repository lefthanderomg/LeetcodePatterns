package book.chapter1.ProgrammingModel1_1

import utils.step
import javax.swing.text.html.HTML.Attribute.N
import kotlin.math.ln
import kotlin.math.pow


class W1_1_14 {

    fun invoke(N: Int): Int {
        var result = 0

        var count = N
        while (count > 1) {
            result++
            count /= 2
        }

        return result
    }

    fun invoke2(N: Int): Double {

        return ln(N.toDouble()) / ln(2.0)
    }

    fun invoke3(N: Int): Double {

        return Math.E.pow(N-2)
    }
}