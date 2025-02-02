package ch05.ex2_2_3_AllAnyCountFind2

data class Person(val name: String, val age: Int)

val canBeInClub27 = { p: Person -> p.age <= 27 }
//相当于filter
fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 27), Person("Bob", 31))
    //相当于filter
    println(people.find(canBeInClub27))
}
