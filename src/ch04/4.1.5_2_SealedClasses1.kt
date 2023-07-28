package ch04.ex1_5_2_SealedClasses1

//使用sealed就是子类去继承父类，但是这里继承的父类加上了()
//sealed本身是抽象的，而且所有的子类情况都被覆盖了，就不存在还有else的情况了，就像枚举
sealed class Expr {
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
}

fun eval(e: Expr): Int =
    when (e) {
        is Expr.Num -> e.value
        is Expr.Sum -> eval(e.right) + eval(e.left)
    }

fun main(args: Array<String>) {
    println(eval(Expr.Sum(Expr.Sum(Expr.Num(1), Expr.Num(2)), Expr.Num(4))))
}
