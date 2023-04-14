package Kotlin

import kotlin.math.E

fun main() {
val facebookLogIn = User.Facebook("Mario.Rossi", "helloworld!")
val googleLogIn = User.Google("MarioRossi97", "HeLlOwOrLd")
val emailLogIn = User.Email("mario.rossi@gmail.com", "HelloWorld!")
    logIn(facebookLogIn)
    logIn(googleLogIn)
    logIn(emailLogIn)

}

fun logIn(user: User) = when(user){
    is User.Facebook -> println("Facebook credentials: $user")
    is User.Google -> println("Google credentials: $user")
    is User.Email -> println("Email credentials: $user")

}
sealed class User(open val id: String, open val password: String) {

    data class Facebook(override val id: String, override val password: String) : User(id, password)

    data class Google(override val id: String, override val password: String) : User(id, password)


    data class Email(override val id: String, override val password: String) : User(id, password)
}