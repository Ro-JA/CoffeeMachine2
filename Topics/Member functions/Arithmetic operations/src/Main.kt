import kotlin.math.abs

class ArithmeticOperations(private val x: Int, private val y: Int) {
    fun addition(): Int = x + y
    fun subtraction(): Int = abs(x - y)
    fun multiplication(): Int = x * y
    fun division(): Int = x / y
}