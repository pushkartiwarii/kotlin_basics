fun main () {
    val f: (Int) -> Int = { x: Int -> x*3 + x+10}
    println(f(2))
    val g: (Int, Int) -> Int = { a: Int, b: Int ->
    val c=a*b
    c*a+b}
    println(g(10,10))
}
