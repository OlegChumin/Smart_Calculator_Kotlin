const val ZERO = 0

fun main() {
    println(sumOfElementsFromConsoleInputSequence())
}

fun sumOfElementsFromConsoleInputSequence(): Int {
    var readNumber: Int
    var sum = ZERO
    do {
        readNumber = readln().toInt()
        if (readNumber != ZERO) {
            sum += readNumber
        }
    } while (readNumber != ZERO)
    return sum
}