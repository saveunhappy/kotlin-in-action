package strings
//扩展了一个方法
fun String.lastChar(): Char = this[this.length - 1]

fun main(args: Array<String>) {
    println("Kotlin".lastChar())
}
