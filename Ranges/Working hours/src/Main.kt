const val WORK_TIME_START = 9
const val LUNCH_TIME_START = 13
const val WORK_TIME_END = 18
const val LUNCH_TIME_END = 14
fun main() {
    val time = readln().toInt()
    val workTime = WORK_TIME_START..WORK_TIME_END
    val lunchTime = LUNCH_TIME_START..LUNCH_TIME_END
    // do not change the code above
    println(time !in lunchTime && time in workTime)
}