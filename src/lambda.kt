fun main (){
val f = {X: Int -> X*3 + X + 10}
    println(f(2))
    val g = { a: Int, b: Int ->
        val c=a+b*10
        c*20+10

    }
    println(g(
        10,
        10
    ))
}