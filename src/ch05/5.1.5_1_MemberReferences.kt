package ch05.ex1_5_1_MemberReferences

fun salute() = println("Salute!")
//两种写法
fun main(args: Array<String>) {
    run(::salute)
    run { salute() }
}
