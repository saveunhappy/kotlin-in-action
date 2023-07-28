package ch07.SplitFilename

import java.io.File
//分割
data class NameComponents(val name: String,
                          val extension: String)

fun splitFilename(fullName: String): NameComponents {
    val result = fullName.split('.', limit = 2)
    return NameComponents(result[0], result[1])
}

fun main(args: Array<String>) {
    val (name, ext) = splitFilename("example.kt.java.js")
    println(name)
    println(ext)
}
