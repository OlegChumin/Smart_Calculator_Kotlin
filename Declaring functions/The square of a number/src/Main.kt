fun main() {
    println(square(readLine()!!.toInt()))
}

fun square(number: Int) = Math.pow(number.toDouble(), 2.0).toInt()