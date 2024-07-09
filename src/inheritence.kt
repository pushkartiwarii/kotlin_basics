open class Human(
    open val name: String,
    open val age: Int,
    open val gender : String ="M"
){
    open fun detail (){
        println("I am $name")
        println("I am $age yrs old")
        //println("I AM $gender")
        when(gender) {
            "M" -> println("I am Male")
            "F" -> println("I am Female")
        }

    }
}

class student(
    override val name: String,
    override val age: Int,
    override val gender: String,
    val school: String,
    val klass: String,
):Human(name,age){
    override fun detail() {
        super.detail()
        println("I study in $school")
        println("I am in class $klass")

    }

}

fun main() {
    val h1 = Human("raju",20,"M",)
    val s1 = student("rani", 23, "F","kv","12th")

    h1.detail()
    println()
    s1.detail()

}