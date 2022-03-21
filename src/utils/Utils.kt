package utils

infix fun IntProgression.step(next: (Int) -> Int): Sequence<Int> = (first..last).step(next)

infix fun IntRange.step(next: (Int) -> Int) = generateSequence(first, next).takeWhile {
    if (first < last) {
        it <= last
    } else {
        it >= last
    }
}