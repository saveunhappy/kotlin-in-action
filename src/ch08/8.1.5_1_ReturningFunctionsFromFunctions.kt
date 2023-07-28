package ch08.ex1_5_1_ReturningFunctionsFromFunctions

enum class Delivery { STANDARD, EXPEDITED }
//调用函数，可以返回另一个函数，你可以吧函数当成对象用，
class Order(val itemCount: Int)

fun getShippingCostCalculator(
        delivery: Delivery): (Order) -> Double {
    if (delivery == Delivery.EXPEDITED) {
        return { order -> 6 + 2.1 * order.itemCount }
    }

    return { order -> 1.2 * order.itemCount }
}

fun main(args: Array<String>) {
    //返回的这个对象，是一个函数
    val calculator =
        getShippingCostCalculator(Delivery.EXPEDITED)
    //返回的这个对象，是一个函数,函数继续调用
    val calculator1 = calculator(Order(3))
    println(calculator1)
    println("Shipping costs ${calculator(Order(3))}")
}
