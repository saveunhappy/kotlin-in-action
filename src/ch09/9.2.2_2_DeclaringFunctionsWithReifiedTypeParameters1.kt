package ch09.ex2_2_2_DeclaringFunctionsWithReifiedTypeParameters1
//过滤出字符串类型的，这个list添加的其实是T，就是任何类型都可以，但是你只需要String类型的，
//这样就可以过滤出来了。
fun main(args: Array<String>) {
    val items = listOf("one", 2, "three")
    println(items.filterIsInstance<String>())
}

inline fun <reified T> Iterable<*>.filterIsInstance() : List<T>{
    val destination = mutableListOf<T>()
    for (element in this){
        if(element is T){
            destination.add(element)
        }
    }
    return destination
}
