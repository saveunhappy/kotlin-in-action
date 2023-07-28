package ch11.ex2_1_3_LambdasWithReceivers2
//看调用是属性和方法的集合。
val appendExcl : StringBuilder.() -> Unit =
        { this.append("!") }

fun main(args: Array<String>) {
    val stringBuilder = StringBuilder("Hi")
    stringBuilder.appendExcl()
    println(stringBuilder)
    println(buildString(appendExcl))
}
