package ch08.ex1_2_2_CallingFunctionsPassedAsArguments1
//indices相当于数组，只是获得下标，String是实现了CharSequence接口，所以可以去迭代单个字符
fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for (index in indices) {
        val element = get(index)
        if (predicate(element)) sb.append(element)
    }
    return sb.toString()
}

fun main(args: Array<String>) {
    println("ab1c".filter { it in 'a'..'z' })
}
