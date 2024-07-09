fun main() {
    var a: Int? = 0
    println(a)
    a=null
    println(a)

    var name: String? = null
    println(name)
    name = null
    //name = readLine()
    println(name)
    println(name?.length ?: "no length is available")
    println(name?.isBlank() ?: "no data available")
    /*
    ? nullability
    ?. null check or null safety operator
    ?: elvis operator
    TODO: will start here
    */
}