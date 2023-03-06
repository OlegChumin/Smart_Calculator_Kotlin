fun main() {
    val number = readln().toInt()
    var firstBoundary = readln().toInt()
    var secondBoundary = readln().toInt()
    val temp: Int
    if (secondBoundary < firstBoundary) {
        temp = firstBoundary
        firstBoundary = secondBoundary
        secondBoundary = temp
    }
    println(if (number >= firstBoundary && number <= secondBoundary) "true" else "false")
}