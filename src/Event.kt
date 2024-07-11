
//best example will be when we inmplement this in view model
sealed class Error(val message: String){
    class NetworkError : Error("Network Failure")
    class DatabaseError : Error("database Error")
    class UnknownError : Error("Unknown Error Ocurred")
}

fun main() {
    val ne = Error.NetworkError()
    val ve= Error.UnknownError()
    println(ne.message)
    println(ve.message)
}