fun main() {
    println(
        readln().toInt().let { if (it in -14..12 || it in 15..16 || it >= 19) "True" else "False" }
    )
}