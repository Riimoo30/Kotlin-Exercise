package Kotlin

fun main() {
val test = Car("Audi", "TT")
val test2 =Car2("Fiat", "Punto")
    println(test.name())
    println(test2.name())
}

interface Named {
    val model: String
    val brand: String


    fun name(): String {
        return "Model: $model, brand: $brand, Using Interface"
    }
}
open class Named2(open val model: String,open val brand: String) {
    fun name(): String {
        return "Model: $model, brand: $brand, Using inheritance"
    }
}
     class Car(override val model: String, override val brand: String) : Named{


    }

    class Car2(override val model: String,override val brand: String) : Named2(model, brand) {
    }


