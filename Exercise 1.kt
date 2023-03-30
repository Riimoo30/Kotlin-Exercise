package Kotlin

fun main() {
    for(i in 1 ..100 step 2) {
        if(i < 50){
            oneTo50(i)
        }else{
            fiftyTo100(i)
        }
    }
}

fun oneTo50( number: Int) {
    //loop for number from 1 to 50
    for (i in 1..50 step 2) {
    }
    println(number)
}

fun fiftyTo100(number: Int){
    for(i in 50 ..100 step 2){
    }
    println(number)
}