fun main() {
    val animal = buildString {
        append("dog")
    }
    when (animal) {
        "horse" -> {
            println("animal is a horse")
        }
        "girrafe" -> {
            println("animal is a girrafe")
        }
        "dog" -> {
            println("animal is a dog")
        }
        else -> {
            println("animal is not found")
        }
    }

}