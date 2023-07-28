package ch06.ex1_6_NotnullAssertions
//相当于在咆哮编译器，肯定不是空的，就是使用!!
fun ignoreNulls(s: String?) {
    val sNotNull: String = s!!
    println(sNotNull.length)
}

fun main(args: Array<String>) {
    ignoreNulls(null)
}
