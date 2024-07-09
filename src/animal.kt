
open class animal(
    group: String? = null

) {
    fun eat(){
        print("animal eats")
    }
    fun sleep(){
        print("animal sleeps")
    }

}

class monkey: animal(group = "mammal"){
    fun jump (){
        println("jump around")
    }


}

class crocodile: animal(group = "reptile"){
    fun hunting (){
        println("hunts in water")
    }
}

fun main() {
    val o1 = monkey()
    val o2 = crocodile()

}