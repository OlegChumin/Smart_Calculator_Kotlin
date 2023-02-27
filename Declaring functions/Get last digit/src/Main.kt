// write your code here

/* Do not change code below */
const val LAST_DIGIT = 10
fun main() {
    println(getLastDigit(readln().toInt()))
}

fun getLastDigit(number: Int) = Math.abs(number % LAST_DIGIT)