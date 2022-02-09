fun main() {
    println("Hello world")

    val greeting1: String = "Greetings everyone 1"
    val greeting2 = "Greetings everyone 2"
    val greeting3 : String? = "Greeting everyone 3"
    println(greeting1)
    println(greeting2)
    println(greeting3)

    val greeting4 = if (greeting1 == "Greetings everyone 1") "Greetings everyone 4" else greeting1
    println(greeting4)

    var g : String? = null
    val greeting5 = when(g) {
        null -> "Greetings everyone 5"
        else -> g
    }
    println(greeting5)

    g = "Greetings everyone 6"
    val greeting6 = when(g) {
        null -> "Something is wrong here"
        else -> g
    }
    println(greeting6)
}