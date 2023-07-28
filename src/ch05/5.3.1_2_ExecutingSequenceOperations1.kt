package ch05.ex3_1_2_ExecutingSequenceOperations1

fun main(args: Array<String>) {
    //这个是轮到一个就去往下走，map之后就filter,下面哪个是先map完，再filter完，最后得到结果
    listOf(1, 2, 3, 4).asSequence()
            .map { print("map($it) "); it * it }
            .filter { print("filter($it) "); it % 2 == 0 }
            .toList()
    println()
    listOf(1, 2, 3, 4)
        .map { print("map($it) "); it * it }
        .filter { print("filter($it) "); it % 2 == 0 }
        .toList()
}
