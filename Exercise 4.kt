package Kotlin

fun main() {
    val value = listOf(1,2,3,4,5)
    println(value)
    value.map {it-> it.toString()}.forEach { it -> println("item = $it")}

}




