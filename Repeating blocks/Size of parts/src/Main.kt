const val INITIAL_NUMBER_FOR_COUNT = 0
const val DETECTOR_RESULT_CAN_BE_FIXED = 1
const val DETECTOR_RESULT_REJECTED = -1
fun main() {
    val numberOfComponents = readln().toInt()
    var largerComponents = INITIAL_NUMBER_FOR_COUNT
    var smallerCompoents = INITIAL_NUMBER_FOR_COUNT
    var rejectedCompoents = INITIAL_NUMBER_FOR_COUNT
    var readData: Int
    repeat(numberOfComponents) {
        readData = readln().toInt()
        if (readData == DETECTOR_RESULT_CAN_BE_FIXED) {
            largerComponents++
        } else if (readData == DETECTOR_RESULT_REJECTED) {
            smallerCompoents++
        } else {
            rejectedCompoents++
        }
    }
    println("$rejectedCompoents $largerComponents $smallerCompoents")
}