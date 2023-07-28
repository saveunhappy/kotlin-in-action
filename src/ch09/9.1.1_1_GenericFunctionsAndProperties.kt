package ch09.ex1_1_1_GenericFunctionsAndProperties
//获取list指定范围内的，而且返回的也是list
fun main(args: Array<String>) {
    val letters = ('a'..'z').toList()
    println(letters.slice<Char>(0..2))
    println(letters.slice(10..13))
}
