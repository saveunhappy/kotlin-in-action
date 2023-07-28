package ch04.ex2_5_ChangingAccessorVisibility
//不允许直接设置，但是通过声明另一个方法来进行操作。
class LengthCounter {
    var counter: Int = 0
        private set

    fun addWord(word: String) {
        counter += word.length
    }
}

fun main(args: Array<String>) {
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi!")
    println(lengthCounter.counter)
}
