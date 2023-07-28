package ch05.ex1_3_4_SyntaxForLambdaExpressions4
//可以直接声明一个lambda表达式
fun main(args: Array<String>) {
    val sum = { x: Int, y: Int ->
       println("Computing the sum of $x and $y...")
       x + y
    }
    println(sum(1, 2))
}
