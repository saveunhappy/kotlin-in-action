package ch04.ex1_2_1_OpenFinalAbstractModifiers

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

open class RichButton : Clickable {
    //默认是final的，不能被重写
    fun disable() {}
    //这个是open的，可以被重写
    open fun animate() {}
    //重写了一个open的函数，那么他本身也就是open的
    override fun click() {}
}
