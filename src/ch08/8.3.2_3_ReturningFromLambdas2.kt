package ch08.ex3_2_3_ReturningFromLambdas2
//往下面看，有好例子。
fun main(args: Array<String>) {
    println(StringBuilder().apply sb@{
       listOf(1, 2, 3).apply {
           this@sb.append(this.toString())
       }
    })
}
data class Student(val name: String, val age: Int, val className: String)

val class1 = listOf(Student("Alice", 18, "Class 1"), Student("Bob", 19, "Class 1"))
val class2 = listOf(Student("Charlie", 17, "Class 2"), Student("David", 18, "Class 2"))
val allClasses = listOf(class1, class2)
fun getStudentNames(): List<String> {
    val result = mutableListOf<String>()

    allClasses.forEach{ classList ->
        classList.onEach { student ->
            if (student.age >= 18) {
                result.add(student.name)
            }
        }
    }

    return result
}
fun getStudentNames2(): List<String> {
    val result = mutableListOf<String>()

    allClasses.forEach classLoop@{ classList ->
        classList.apply studentLoop@{
            this@studentLoop.forEach { student ->
                if (student.age >= 18) {
                    result.add(student.name)
                }
            }
        }
    }

    return result
}
