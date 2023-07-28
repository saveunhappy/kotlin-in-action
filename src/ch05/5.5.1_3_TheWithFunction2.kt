package ch05.ex5_1_3_TheWithFunction2
//with是把对象包装了一下，就相当于进行调用了void，你最后想把StringBuilder进行一系列
// 操作转换成Person都行，apply就是进行了一系列赋值，但是还是要返回哪个对象本身
//public inline fun <T, R> with(receiver: T, block: T.() -> R): R = receiver.block()
//with就相当于stream中的map操作，apply相当于filter操作
fun alphabet() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
    toString()
}

fun main(args: Array<String>) {
    println(alphabet())
}
