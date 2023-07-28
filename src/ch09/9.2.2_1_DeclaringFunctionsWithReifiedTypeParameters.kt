package ch09.ex2_2_1_DeclaringFunctionsWithReifiedTypeParameters
//Java的是泛型擦除，kotlin可以在运行时就给你检测了，自己做校验reified就是去获取你泛型
//的真实类型，可以用作validator的验证器
//函数调用在字节码中就去去调用方法，找到那个方法的声明，去调用
//使用，如果你使用了inline，那么就是调用真实的方法，就是把方法的那部分代码直接写到了你的
//字节码中去了。
inline fun <reified T> isA(value: Any) = value is T

fun main(args: Array<String>) {
    println(isA<String>("abc"))
    println(isA<String>(123))
}
