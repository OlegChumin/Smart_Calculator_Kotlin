const val START_GRADE_COUNT = 0
const val GRADE_D = 2
const val GRADE_C = 3
const val GRADE_B = 4

fun main() {
    var gradeD = START_GRADE_COUNT
    var gradeC = START_GRADE_COUNT
    var gradeB = START_GRADE_COUNT
    var gradeA = START_GRADE_COUNT

    repeat(readln().toInt()) {
        val grade = readln().toInt()
        if (grade == GRADE_D) {
            gradeD++
        } else if (grade == GRADE_C) {
            gradeC++
        } else if (grade == GRADE_B) {
            gradeB++
        } else gradeA++
    }
    println("$gradeD $gradeC $gradeB $gradeA")
}