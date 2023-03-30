package Kotlin

fun main() {
    var num1 : Long = 33
    var num2 : Byte = 2
    var num3 : Int = 21
    var numResult = num1.toInt() + num2.toInt() + num3
    println("The result is $numResult")
    var isResultInt = numResult is Int
    println(isResultInt)

    var number1 : Float = 22F
    var number2 : String = "44"
    printSum(2, 2)
    println("Is number1 bigger than number 2: ${number1 > number2.toDouble()} ")
   println(numbers(22))

}
fun printSum(num1: Int, num2: Int){
    var sum = num1 + num2
    println(sum)
}

class numbers (number : Int){
    init {
        println("The number is $number")
    }
}