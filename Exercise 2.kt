package Kotlin

fun main() {
    val test = Car("Audi", "TT")
    println(test.name())
    println(test.name2())
}

class Car(override val model : String, override val brand: String) : Named, Named2(brand) {

}
interface Named {
    val model :String
    fun name(): String{
        return "Model: $model, Using Interface"
    }
}

open class Named2(open val brand: String) {
    fun name2(): String {
        return "Brand: $brand, Using Inheritance"
    }
}
