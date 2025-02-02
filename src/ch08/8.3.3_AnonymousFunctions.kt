package ch08.ex3_3_AnonymousFunctions

data class Person(val name: String, val age: Int)

val people = listOf(Person("Alice", 29), Person("Bob", 31))
//只是命名清晰了，其实是可以使用it的。
fun lookForAlice(people: List<Person>) {
    people.forEach(fun (person) {
        if (person.name == "Alice") return
        println("${person.name} is not Alice")
    })
}

fun main(args: Array<String>) {
    lookForAlice(people)
}
