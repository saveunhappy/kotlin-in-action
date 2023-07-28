package ch02.EvalIf

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr
//Java中类比着就是instance of，但是你用了还是要在下面强转，但是在这里就不用强转了，编译器
//帮你干了。
fun eval(e: Expr): Int =
    when (e) {
        is Num -> {
            e.value
        }

        is Sum -> {
            eval(e.right) + eval(e.left)
        }

        else -> {
            throw IllegalArgumentException("Unknown expression")
        }
    }

fun main(args: Array<String>) {
    println(eval(Sum(Num(1), Num(2))))
}
