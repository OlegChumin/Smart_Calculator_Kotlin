const val LOOP_NUMBER = 4
fun main() {
    val char = CharArray(LOOP_NUMBER)
    repeat(LOOP_NUMBER) {
        char[it] = readChar()
    }
    repeat(LOOP_NUMBER) {
        print("${--char[it]}\n")
    }
}
fun readChar() = readln().first()