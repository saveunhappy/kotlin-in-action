package ch11.ex2_1_1_LambdasWithReceivers

fun buildString(
        builderAction: (StringBuilder) -> Unit
): String {
    val sb = StringBuilder()
    //这个方法接收一个StringBuilder，那么就在里面构建一个StringBuilder，给传进去
    //在外面调用的时候，it就是只带的StringBuilder了，然后StringBuilder有append方法，所以
    //可以调用append
    builderAction(sb)
    return sb.toString()
}

fun main(args: Array<String>) {
    val s = buildString {
        it.append("Hello, ")
        it.append("World!")
    }
    println(s)
}
