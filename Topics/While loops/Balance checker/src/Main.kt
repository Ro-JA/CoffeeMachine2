import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    var prise = 0
    while (scanner.hasNextInt()) {
        val next = scanner.nextInt()
        prise = next
        if (balance - prise < 0) {
            println(
                "Error, insufficient funds for the purchase. Your balance is $balance, " +
                        "but you need $prise."
            )
        }
        balance -= prise
    }
    if (balance >= 0) {
        println("Thank you for choosing us to manage your account! Your balance is $balance.")
    }
}