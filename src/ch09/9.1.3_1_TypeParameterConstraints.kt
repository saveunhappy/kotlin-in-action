package ch09.ex1_3_1_TypeParameterConstraints
//上限
fun <T : Number> oneHalf(value: T): Double {
    return value.toDouble() / 2.0
}

fun main(args: Array<String>) {
    println(oneHalf(3))
}
