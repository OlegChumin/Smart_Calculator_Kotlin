fun main() {
    println(readlnUIntNumbersWhileNotZero())
}

fun readlnUIntNumbersWhileNotZero(): UInt {
    var count: UInt = UInt.MIN_VALUE
    while (readln().toUInt() > UInt.MIN_VALUE) {
        count++
    }
    return count
}