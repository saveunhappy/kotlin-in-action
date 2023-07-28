package ch06.ex1_1_NullableTypes
//?: 就是如果是空的话返回什么。
fun strLenSafe(s: String?): Int =
    s?.length ?: 0

fun main(args: Array<String>) {
    val x: String? = null
    println(strLenSafe(x))
    println(strLenSafe("abc"))
}
