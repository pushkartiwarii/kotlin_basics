fun main(){
    val movies = listOf("avengers","la la land","spiderman")
    for (name in movies) {
        println("i love movies")
    }
    for(idx in movies.indices){
        println("$idx is ($idx{movies[idx]}")
    }
    //ranges
    val x = 10
    if(x in 1..10){
        println("fits in range")
    }
    for (x in 1..5){
        println()
    }

    //sum of all digits
    val number=129032
    var temp = number
    var total = 0
    while(temp > 0){
        println("$temp => $total")
        total += temp%10
        temp /=10
    }
    println("total of $number is $total")

    //about me

    var aboutme= ""
    do{
        val line = readln()
        aboutme += line + "\n"
    } while (line.isNotBlank())
    println("about me\n$aboutme")
}