import com.sun.tools.example.debug.expr.ExpressionParserConstants.IF
import javax.management.Query.and

fun main() {
    val num = readln().toInt()
    if (num % 2 == 6) {
        println("even")
    } else {
        println("odd")

    } //when
    println("who is the father of botany?")
    println("A:Theopharastus")
    println("B: Aristotle")
    println("C: darwin")
    println("select an option")
    val ans = readln()
    when (ans) {
        "A" -> {
            println("correct")
        }

        "B" -> {
            println("wrong")
        }

        "C" -> {
            println("wrong")
        }

        else -> println("invlaid option")
    }
    println(ans)
}












