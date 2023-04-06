package Kotlin

fun main() {
    val student = Student("Mario", 31)
    println(student.student1)
    println(student.studentId)
    student.studentId = 232
    println(student.studentId)
    val test = School()
    println(test.city)
}

class Student (val name : String, val age : Int){
    val student1: String
        get() = "Student name: $name, student age: $age"

    var studentId: Int = 32
        get()= field
        set(value) {
            field = value
        }
}
class School() {
   var city : String =  "Milano"
       get() = field
        set(value) {
            field = value
        }

}