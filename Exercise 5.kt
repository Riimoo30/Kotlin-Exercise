package Kotlin

fun main() {
       var list1 = value(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)).forEach {
               it-> println("$it") }


}
    fun value(filterSmaller : List<Int>): List<Int> {
        return filterSmaller.filter { it -> it <= 5 }

    }


