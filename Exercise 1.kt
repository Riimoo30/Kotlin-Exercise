package Kotlin

import java.util.stream.Stream

fun main() {
    for(i in 1 ..100 step 2) {
        if(i < 50){
            oneTo50(i)
        }else{
            fiftyTo100(i)
        }
    }
}

fun oneTo50(number : Int) {
    println(number)
}

fun fiftyTo100(number: Int){
    println(number)
}