package ch04.ex1_2_2_OpenFinalAbstractModifiers1

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

open class RichButton : Clickable {
    //如果不希望被重写，那么得加上final
    final override fun click() {}
}
