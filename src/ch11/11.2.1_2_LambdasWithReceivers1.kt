package ch11.ex2_1_2_LambdasWithReceivers1

fun buildString(
    //StringBuilder.()就是代表StringBuilder是这个lambda的receiver，
    /*
    * 和builderAction: (StringBuilder) -> Unit其实没有本质的区别，就是一个调用it
    * 一个调用this。
    * val persons = ListOf(Person("bar"),Person("foo"))
    * persons.apply{
    *   this.
    * }
    * 还有一个是it
    * */
        builderAction: StringBuilder.() -> Unit
) : String {
    val sb = StringBuilder()
    sb.builderAction()
    return sb.toString()
}

fun main(args: Array<String>) {
    val s = buildString {
        this.append("Hello, ")
        append("World!")
    }
    println(s)
}
