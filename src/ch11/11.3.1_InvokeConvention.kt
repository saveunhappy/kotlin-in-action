package ch11.ex3_1_InvokeConvention
//在这里invoke就是你不想写方法，变量本身就能调用，就用这种方式
class Greeter(private val greeting: String) {
    operator fun invoke(name: String) {
        println("$greeting, $name!")
    }
}

fun main(args: Array<String>) {
    val bavarianGreeter = Greeter("Servus")
    bavarianGreeter("Dmitry")
}
