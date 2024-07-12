fun main() {
    val data= listOf(2,3,4,5,29,94,20,55)
    println(data.filter {
        it%2!=0
    })
    println(data.map {it*it })
    val oddsqr=data.filter {it%2!=0}.map { it*it }
    println("results:$oddsqr")

    fun isPositive(num:Int)=num>0
    fun isNegative(num:Int)=num<0
    fun myFilter(check:(num:Int)->Boolean){
        println("my filter called")
    }
    myFilter { isNegative(22) }
}