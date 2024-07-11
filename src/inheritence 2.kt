//interfaces
interface Vehicle{
    fun start() //declare methods
    fun stop() //declare methods

}
class Car(): Vehicle{
    override fun start() {
        println("Car is starting")

    }

    override fun stop() {

        println("Car is stopping")
    }
}
class Truck(): Vehicle{
    override fun start() {
        println("Truck is starting")
    }

    override fun stop() {
        println("Truck is stopping")
    }

}

abstract class Smartphone{
   open fun takepicture(){
        println("function to take picture")
    }
    open fun takecall(){
        println("function to take calls")
    }
}
class Iphone: Smartphone(){
    override fun takepicture() {
        println("Function to take pictures with Iphone")

    }

    override fun takecall() {
        println("Function to take calls with Iphone ")

    }
}

fun main() {
    val i1=Iphone()
    val c1=Car()
    val t1=Truck()
    i1.takepicture()
    i1.takecall()
    c1.start()
    t1.start()
    c1.stop()
    t1.stop()
}