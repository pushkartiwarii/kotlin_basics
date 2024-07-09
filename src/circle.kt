class circle (
    val radius : Int
){
    init {
        println("circle obeject created")
    }
    fun circumference()= 2 * Math.PI*radius
    fun area()= Math.PI*radius*radius
}

fun main() {
    val r= readln().toInt()
    val c1= circle(r)
    println("circle with radius ${c1.radius}")
    println("area will be ${c1.area()}")
    println("circumference will be ${c1.circumference()}")
}