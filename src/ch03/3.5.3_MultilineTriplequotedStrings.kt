package ch03.ex5_3_MultilineTriplequotedStrings
//去掉了点，记住这个方式就行了。
val kotlinLogo = """| //
                   .|//
                   .|/ \"""

fun main(args: Array<String>) {
    println(kotlinLogo.trimMargin("."))
}
