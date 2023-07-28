package ch05.ex2_3_1_GroupBy

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 31),
            Person("Bob", 29), Person("Carol", 31))
    //也是一样的，不需要那么麻烦
    println(people.groupBy { it.age })
}
