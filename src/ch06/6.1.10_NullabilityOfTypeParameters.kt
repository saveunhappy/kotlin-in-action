package ch06.ex1_10_NullabilityOfTypeParameters
//如果是空，那么就返回空
fun <T : Any?> printHashCode(t: T) {
    println(t?.hashCode())
}

fun main(args: Array<String>) {
    printHashCode(null)
}
