fun main() {
    val items= listOf(2,5,1,3,6,7,2)

    var total = items.fold(1){acc, x ->acc+x  }
    println("total of $items is $total")

    val mTotal = items.fold(1){acc, x-> acc*x}
    println("multiplication is $items is $mTotal")
    //var total= 0
    //for(i in items){



}