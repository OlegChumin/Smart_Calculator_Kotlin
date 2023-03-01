import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = scanner.nextInt()
    var debit = balance
    println("balance = $balance")
    while (scanner.hasNextInt()) {
        debit = scanner.nextInt()
        if (debit > balance) {
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $debit.")
            break;
        } else {
            balance -= debit
        }
    }
    if (debit < balance) {
        println("Thank you for choosing us to manage your account! Your balance is $balance.")
    }
}