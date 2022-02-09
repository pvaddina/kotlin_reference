class Employee1 {}
class Employee2 constructor() {}
class Employee3


class Employee4(_fn:String, _ln:String) {
    val FirstName: String
    val LastName: String

    init {
        println("In Init1")
        FirstName = _fn
        LastName = _ln
    }
}
class Employee5(_fn:String, _ln:String) {
    val FirstName: String = _fn
    val LastName: String = _ln
}
class Employee6(val firstName:String, val lastName:String) {
}
class Employee7(val firstName:String, val lastName:String) {
    init {
        println("The first Init")
    }
    constructor() : this("Harry", "Potter") {
        println("In secondary constructor")
    }
    init {
        println("The second Init")
    }
}
class Employee8(val firstName:String = "Harry", val lastName:String = "Potter") {
}
class Employee9(val firstName:String = "Harry", val lastName:String = "Potter") {
    var id: Int? = null
        set(value) {
            println("In setter for id")
            field = value
        }
        get() {
            println("In getter for id")
            return field
        }

    fun PrintInfo() {
        println("Employee: $firstName $lastName has the id $id")
    }
}
