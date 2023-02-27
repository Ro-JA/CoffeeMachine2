import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val countryFirst = scanner.next()
    val countrySecond = scanner.next()

    try {
        println(
            CurrencyCountry.valueOf(countryFirst).currency == CurrencyCountry.valueOf(countrySecond).currency
        )
    } catch (e: IllegalArgumentException) {
        println(false)
    }
}

enum class CurrencyCountry(val country: String, val currency: String) {
    Germany("Germany", "Euro"),
    Mali("Mali", "CFA franc"),
    Dominica("Dominica", "Eastern Caribbean dollar"),
    Canada("Canada", "Canadian dollar"),
    Spain("Spain", "Euro"),
    Australia("Australia", "Australian dollar"),
    Brazil("Brazil", "Brazilian real"),
    Senegal("Senegal", "CFA franc"),
    France("France", "Euro"),
    Grenada("Grenada", "Eastern Caribbean dollar"),
    Kiribati("Kiribati", "Australian dollar");
}