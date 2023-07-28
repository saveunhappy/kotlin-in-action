package ch07.ex5_2_2_LazyInitialization1
/*
* lateinit 和 by lazy 都是 Kotlin 中用于延迟初始化属性的方式，但它们之间有一些重要的区别：

可用于属性类型：

lateinit 只能用于可变属性（var），并且只能用于类级别的属性（即在类中声明的属性，而不是在函数内部）。
by lazy 只能用于只读属性（val），并且可以用于类级别的属性或者局部作用域（在函数内部）的属性。
初始化时机：

lateinit 属性必须在声明时或者在初始化块中进行赋值。如果在使用 lateinit 属性之前没有进行赋值，会抛出 UninitializedPropertyAccessException 异常。
by lazy 属性在第一次访问时进行初始化，初始化操作仅会执行一次，后续访问会直接使用之前初始化的值。
初始化方式：

lateinit 属性是通过直接对属性赋值来实现延迟初始化。
by lazy 属性是通过 lazy { ... } 的委托方式来实现延迟初始化。在第一次访问属性时，lazy { ... } 中的 lambda 表达式会执行，并且 lambda 表达式的结果会被缓存，后续访问属性时直接返回缓存的结果。
线程安全性：

lateinit 属性不是线程安全的，如果在多线程环境下对 lateinit 属性进行初始化和访问，需要自行保证线程安全性。
by lazy 属性默认是线程安全的，它使用了 synchronized 来确保只有一个线程进行初始化，并且后续访问时无需再进行同步操作。但请注意，如果自定义了委托对象，并且该委托对象不是线程安全的，那么 by lazy 属性也就不是线程安全的。
*
* */
class Email { /*...*/ }
fun loadEmails(person: Person): List<Email> {
    println("Load emails for ${person.name}")
    return listOf(/*...*/)
}
//懒加载，
class Person(val name: String) {
    val emails by lazy { loadEmails(this) }
}
class Example {
    lateinit var name: String // 只能用于 var 属性，必须在声明时或初始化块中赋值

    val lazyName: String by lazy {
        println("Initializing lazyName") // 第一次访问时执行
        "Lazy Name"
    }
}

fun main(args: Array<String>) {
    val p = Person("Alice")
    p.emails
    p.emails

    val ex = Example()
    // ex.name = "John" // 这里如果不给 name 赋值会抛出 UninitializedPropertyAccessException 异常

    println(ex.lazyName) // 第一次访问 lazyName，执行初始化操作
    println(ex.lazyName) // 后续访问 lazyName，直接返回之前缓存的结果
}
