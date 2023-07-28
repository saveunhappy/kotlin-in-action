package ch05.ex1_5_2_MemberReferences1

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    //这样就是不用初始化了。
    val createPerson = ::Person
    val p = createPerson("Alice", 29)
    println(p)
}
