import java.util.Scanner

fun main() {
    val numbers = readln().split(" ").map { it.toInt() }.toTypedArray()
    val list = mutableListOf<Int>(*numbers)
    println(list.maxOrNull())
}