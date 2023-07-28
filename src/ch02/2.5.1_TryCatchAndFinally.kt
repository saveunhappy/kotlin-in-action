package ch02.ex5_1_TryCatchAndFinally

import java.io.BufferedReader
import java.io.StringReader

fun readNumber(reader: BufferedReader): Int? {
    return try {
        val line = reader.readLine()
        Integer.parseInt(line)
    }
    catch (e: NumberFormatException) {
        null
    }
    finally {
        reader.close()
    }
}

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("4"))
    println(readNumber(reader))
}
