package statepattern

fun main(args: Array<String>) {
    val auth = AuthProcessor()
    auth.loginUser("admin")
    println(auth)
    auth.logoutUser()
    println(auth)
}
