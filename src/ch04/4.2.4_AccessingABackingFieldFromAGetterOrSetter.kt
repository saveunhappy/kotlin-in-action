package ch04.ex2_4_AccessingABackingFieldFromAGetterOrSetter
//set方法可以加入一些自定义的逻辑
class User(val name: String) {
    var address: String = "unspecified"
        set(value) {
            println("""
                Address was changed for $name:
                "$field" -> "$value".""".trimIndent())
//            field = value
            field = value
        }
}

fun main(args: Array<String>) {
    val user = User("Alice")
    user.address = "Elsenheimerstrasse 47, 80687 Muenchen"
    println(user.address)
}
