package ch07.ex5_5_2_StoringPropertyValuesInAMap1
//两个属性本来是没有关系的，但是要用map进行关联，就可以用这个
class Person {
    private val _attributes = hashMapOf<String, String>()

    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    val name: String by _attributes
    val company: String by _attributes
}

fun main(args: Array<String>) {
    val p = Person()
    val data = mapOf("name" to "Dmitry", "company" to "JetBrains")
    for ((attrName, value) in data)
       p.setAttribute(attrName, value)
    println(p.name)
    println(p.company)
}
