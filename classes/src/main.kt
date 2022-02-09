fun main() {
    println("\nUsing Employee1, 2 and 3")
    var emp1 = Employee1()
    var emp2 = Employee2()
    var emp3 = Employee3()

    println("\nUsing Employee4")
    val emp4 = Employee4("Tom", "Riddle")
    println("\nUsing Employee5")
    val emp5 = Employee5("Lord", "Voldemort")
    println("\nUsing Employee6")
    val emp6 = Employee6("Mad", "Eye")

    println("\nUsing Employee7 with arguments")
    val emp71 = Employee7("Ron", "Wiesley")
    println("\nUsing Employee7 without arguments")
    val emp72 = Employee7()

    println("\nUsing Employee8 with arguments")
    val emp81 = Employee8("Ron", "Wiesley")
    println("\nUsing Employee8 without arguments")
    val emp82 = Employee8()

    println("\nUsing Employee9")
    val emp9 = Employee9("Ron", "Wiesley")
    emp9.PrintInfo()
    emp9.id = 999
    emp9.PrintInfo()
}