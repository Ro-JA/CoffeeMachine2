import kotlin.math.abs

class ArithmeticOperation(var x: Int, var y: Int) {
    fun addition(): Int = x + y
    fun subtraction() : Int = abs(x - y)
    fun  multiplication() : Int = x * y
    fun division() : Int = x / y
}

