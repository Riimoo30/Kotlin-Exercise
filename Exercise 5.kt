package Kotlin

fun main() {
       var list1 = listOf<Int>(1,2,3,4,5,6,7,8,9,10).filterSmaller().printValues()


}
    fun List<Int>.filterSmaller(): List<Int> {
        return this.filter { it <= 5 }

    }

    fun List<Int>.printValues(){
        forEach { println(it) }
    }

