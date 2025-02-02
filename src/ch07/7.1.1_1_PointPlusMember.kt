package ch07.PointPlusMember
//operator,是重载算术运算符
data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
    operator fun minus(other: Point): Point {
        return Point(x - other.x, y - other.y)
    }
}

fun main(args: Array<String>) {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1 + p2)
    println(p2 - p1)
}
