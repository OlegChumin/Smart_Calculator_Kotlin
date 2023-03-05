fun main() {
    val firstChar = readln().first()
    val secondChar = readln().first()

    println(firstChar.lowercaseChar().compareTo(secondChar.lowercaseChar()) == 0)
}