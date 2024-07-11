class Actor(
    val name:String,
    val gender:String="M"
)
data class Message(
    val dp:String,
    val name: String,
    val last_message:String,
    val time:String,
    val status:String,
    val isnotification: String
)




fun main() {
    val actor = Actor("tom cruise")
    val msg=Message("landscape","ravi","kahan ho","12pm","family function","q")
    println(actor)
    println(msg)
}