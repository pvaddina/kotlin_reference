fun GetGreeting1() : String {
    return "Hello everyone 1"
}
fun GetGreeting2() : String = "Hello everyone 2"
fun GetGreeting3() = "Hello everyone 3"


fun GetGreeting4(f1:String) : String {
    return "Hello " + f1
}
fun GetGreeting5(f1:String, f2:Int) : String {
    return "Hello " + f1 + f2
}

fun ArrayOfTests() {
    println("\nArrayOfTests")
    val items = arrayOf("one", "two", "three", "four")
    println("Using normal for:")
    for(item in items)
        print(item + " ")

    println("\nUsing forEach:")
    items.forEach {
        print(it + " ")
    }

    println("\nUsing forEach2:")
    items.forEach { item ->
        print(item + " ")
    }

    println("\nUsing forEachIndexed:")
    items.forEachIndexed { index, item ->
        print("$index:$item, ")
    }

    println("")
    println("items[0]: " + items[0])
    println("items[1]: " + items[1])
    println("items[2]: " + items[2])
}

fun ListOfTests() {
    println("\nListOfTests")
    val items =  listOf("One", "Two", "Three", "Four")
    println("Using for:")
    for(item in items)
        print("$item ")

    println("\nUsing forEach:")
    items.forEach{ item ->
        print(item + " ")
    }

    println("\nUsing forEachIndexed:")
    items.forEachIndexed{ idx, value ->
        print("$idx:$value, ")
    }

    println("")
    println("items[0]: " + items[0])
    println("items[1]: " + items[1])
    println("items[2]: " + items[2])
}

fun MapOfTests() {
    println("\nMapOfTests")
    var items = mutableMapOf(1 to "one", 5 to "five", 99 to "ninty nine")
    println("Using for:")
    for(item in items)
        print("$item ")

    println("\nUsing forEach:")
    items.forEach{ item ->
        print("$item ")
    }

    println("\nUsing forEachIndexed:")
    items.forEach{ idx, value ->
        print("$idx:$value, ")
    }

    items.put(0, "zero")

    println("")
    println("items[0]: " + items[0])
    println("items[1]: " + items[1])
    println("items[5]: " + items[5])
    println("items[99]: " + items[99])
}

fun MapOfTests(items: MutableMap<Int,String>) {
    println("\nMapOfTests")
    println("Using for:")
    for(item in items)
        print("$item ")

    println("\nUsing forEach:")
    items.forEach{ item ->
        print("$item ")
    }

    println("\nUsing forEachIndexed:")
    items.forEach{ idx, value ->
        print("$idx:$value, ")
    }

    items.put(0, "zero")

    println("")
    println("items[0]: " + items[0])
    println("items[1]: " + items[1])
    println("items[5]: " + items[5])
    println("items[99]: " + items[99])
}

fun SayHello(firstgreet: String, vararg secondItems: String) {
    println("\nSayHello")
    secondItems.forEachIndexed { index, s ->
        println("$index: $firstgreet in $s")
    }
}

fun main() {
    println(GetGreeting1())
    println(GetGreeting2())
    println(GetGreeting3())

    println(GetGreeting4("world!"))
    println(GetGreeting5("everyone ", 5))

    ArrayOfTests()

    ListOfTests()

    MapOfTests()
    val items = mutableMapOf(1 to "one", 5 to "five")
    items.put(99, "ninty nine")
    MapOfTests(items)

    SayHello("Say hello", "Telugu", "Hindi", "English", "Urdu")

    val arrayItems = arrayOf("Telugu", "Hindi", "English")
    SayHello("Say hello", *arrayItems)
}