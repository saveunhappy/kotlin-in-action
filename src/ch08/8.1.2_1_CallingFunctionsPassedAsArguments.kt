package ch08.ex1_2_1_CallingFunctionsPassedAsArguments
//lambda作为参数，只规定了了属性，然后真正调用是在外面传过来的。
//{ a, b -> a + b }符合了operation: (Int, Int) -> Int
//然后operation(2, 3)去进行调用
fun twoAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2, 3)
    println("The result is $result")
}

fun main(args: Array<String>) {
    twoAndThree { a, b -> a + b }
    twoAndThree { a, b -> a * b }
}
