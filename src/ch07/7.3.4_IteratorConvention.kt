package ch07.ex3_4_IteratorConvention

import java.util.Date
import java.time.LocalDate
//in，这里是让你自定义，可以使用in来方便的弄，比如一个普通的字符串还能使用for循环
//去循环每一个字符，就是要拓展hasNext()和next方法
operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
        object : Iterator<LocalDate> {
            var current = start

            override fun hasNext() =
                current <= endInclusive

            override fun next() = current.apply {
                current = plusDays(1)
            }
        }

fun main(args: Array<String>) {
    val newYear = LocalDate.ofYearDay(2017, 1)
    val daysOff = newYear.minusDays(100)..newYear
    for (dayOff in daysOff) { println(dayOff) }
}
