package Kotlin

import kotlin.math.E

fun main() {
val facebookLogIn = Facebook("Mario.Rossi", "helloworld!")
val googleLogIn = Google("MarioRossi97", "HeLlOwOrLd")
val emailLogIn = Email("mario.rossi@gmail.com", "HelloWorld!")
    logIn(facebookLogIn)
    logIn(googleLogIn)
    logIn(emailLogIn)

}

fun logIn(user: User) = when(user){
    is Facebook -> println("Facebook credentials: $user")
    is Google -> println("Google credentials: $user")
    is Email -> println("Email credentials: $user")

}
sealed class User(open val id: String, open val password: String)

data class Facebook (override val id: String, override val password: String) : User(id, password)

open class Google (override val id: String, override val password: String) : User(id, password)


data class Email(override val id: String, override val password: String) : User(id, password)
