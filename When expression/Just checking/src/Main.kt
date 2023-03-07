const val CHOICE_NUMBER_ONE = 1
const val CHOICE_NUMBER_TWO = 2
const val CHOICE_NUMBER_THREE = 3
const val CHOICE_NUMBER_FOUR = 4
fun main() {
    println(
        when (readln().toInt()) {
            CHOICE_NUMBER_ONE -> "No!"
            CHOICE_NUMBER_TWO -> "Yes!"
            CHOICE_NUMBER_THREE -> "No!"
            CHOICE_NUMBER_FOUR -> "No!"
            else -> "Unknown number"
        }
    )
}