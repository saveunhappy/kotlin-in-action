package ch05.ex1_3_3_SyntaxForLambdaExpressions2

fun main(args: Array<String>) {
    run { println(42) }
    val result = StringBuilder().run {
        append("Hello, ")
        append("Kotlin!")
        append("\n")
        append("Welcome to Kotlin")
        append(" world!")
        toString()
    }
    val result1 = StringBuilder().apply {
        append("Hello, ")
        append("Kotlin!")
        append("\n")
        append("Welcome to Kotlin")
        append(" world!")
    }.toString()

}
