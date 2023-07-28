package ch09.ex1_3_3_TypeParameterConstraints2

import java.time.Period
//在这里就是显示T必须是CharSequence和Appendable的子类，或者说实现了这两个接口
fun <T> ensureTrailingPeriod(seq: T)
        where T : CharSequence, T : Appendable {
    if (!seq.endsWith('.')) {
        seq.append('.')
    }
}

fun main(args: Array<String>) {
    val helloWorld = StringBuilder("Hello World")
    ensureTrailingPeriod(helloWorld)
    println(helloWorld)
}
