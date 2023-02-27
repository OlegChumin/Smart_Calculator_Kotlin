fun main() {
    println(
        readln().toInt().let { if (it < 0) "negative" else if (it > 0) "positive" else "zero" }
    )
}