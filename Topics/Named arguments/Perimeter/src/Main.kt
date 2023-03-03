fun perimeter(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double): Double {
    val res = Math.hypot((x2 - x1) + (y2-y1) + (x3-x2) + (y3-y2) + (x4-x3) + (y4-y3) + (x1-x4) + (y1-y4))
    return res
}