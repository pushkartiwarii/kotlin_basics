class person(
    var name: String,
    var age: Int,
    var height: Int,
    var weight: Int,
    var gender: String="male",
    var haircolour: String= "black"

) {

    fun show(){
        println("$name is $age old")
        println("$height and $weight")
        println("$gender")
        println("$haircolour")
    }
}


fun main(){
    val p1 = person(
        "pushkar",
        22,
        154,
        55,
        "male",
        "black"
    )

    val p2 = person( "shruti",
             21,
            15,
             55,
             "female",
            "black")

    p1.show()
    p2.show()


}