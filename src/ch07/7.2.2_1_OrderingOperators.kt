package ch07.ex2_2_1_OrderingOperators

import kotlin.comparisons.compareValuesBy
//比较的话可以直接覆盖，用大于小于进行就可以了,Java中只能使用CompareTo
class Person(
        val firstName: String, val lastName: String
) : Comparable<Person> {

    override fun compareTo(other: Person): Int {
        return compareValuesBy(this, other,
            Person::lastName, Person::firstName)
    }
}

fun main(args: Array<String>) {
    val p1 = Person("Alice", "Smith")
    val p2 = Person("Bob", "Johnson")
    println(p1 < p2)
}
