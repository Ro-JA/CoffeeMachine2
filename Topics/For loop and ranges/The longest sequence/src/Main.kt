fun main() {
    var min = 1
    var count = 0
    var max = 0

   val num = readln().toInt()
    val arr = IntArray(num) { readln().toInt()}
    for (i in arr) {
        if (i >= min) {
            min = i
            count++
            max = count
        } else if (num - max > max){
            min = i
            count = 0
            count++
        }
    }
    println(max)
}
