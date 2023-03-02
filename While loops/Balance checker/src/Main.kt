import java.util.Scanner
//        debit = scanner.useDelimiter(System.getProperty("line.separator")).nextInt()

fun main() {
    var balance = Scanner(System.`in`).nextInt()
    var debit: Int
    var isPositiveBalance: Boolean
    val lineOfPurchasesSequence = Scanner(System.`in`).nextLine()
    val scanner = Scanner(lineOfPurchasesSequence)
        do {
            debit = scanner.nextInt()
            if (debit > balance) {
                println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $debit.")
                isPositiveBalance = false
                break;
            }
            balance -= debit
            isPositiveBalance = true
        } while (scanner.hasNextInt())
    scanner.close()

    if (isPositiveBalance) {
        println("Thank you for choosing us to manage your account! Your balance is $balance.")
    }
}