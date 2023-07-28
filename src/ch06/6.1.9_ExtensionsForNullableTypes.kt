package ch06.ex1_9_ExtensionsForNullableTypes
//kotlin本身就内置了这个null或者empty的方法，比较好
fun verifyUserInput(input: String?) {
    if (input.isNullOrBlank()) {
        println("Please fill in the required fields")
    }
}

fun main(args: Array<String>) {
    verifyUserInput(" ")
    verifyUserInput(null)
}
