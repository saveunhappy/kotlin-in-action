package ch05.ex5_1_2_TheWithFunction1
//with是把对象包装了一下，就相当于进行调用了void，你最后想把StringBuilder进行一系列
// 操作转换成Person都行，不返回都行apply就是进行了一系列赋值，但是还是要返回哪个对象本身
fun alphabet(): String {
    val stringBuilder = StringBuilder()
    return with(stringBuilder) {
        for (letter in 'A'..'Z') {
            this.append(letter)
        }
        append("\nNow I know the alphabet!")
        this.toString()
    }
}

fun main(args: Array<String>) {
    println(alphabet())
}
