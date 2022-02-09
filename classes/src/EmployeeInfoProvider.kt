interface IEmployeeInfoProvider {
    fun GetInfo(employee: Employee9)
}

interface IDepartmentalInfo {
    val Department : String
    fun GetInfo(employee: Employee9) {
        println("This employee belongs to $Department")
        employee.PrintInfo()
    }
}

interface IPrivateInfoProvider {
    val numberChildren: Int?
}

class BasicInfoProvider : IEmployeeInfoProvider {
    override fun GetInfo(employee: Employee9) {
        println("\nBasicInfoProvider")
        employee.PrintInfo()
    }
}

class DepartmentalInfoProvider : IDepartmentalInfo {
    override val Department: String
        get() = "Div1"
    override fun GetInfo(employee: Employee9) {
        println("\nDepartmentalInfoProvider")
        employee.id = 444
        super.GetInfo(employee)
    }
}

open class PrivateInfoProvider : IDepartmentalInfo, IPrivateInfoProvider {
    override val Department: String
        get() = "Ministry of magic"
    override val numberChildren: Int?
        get() = 437
    open val address: String? = null
    override fun GetInfo(employee: Employee9) {
        println("\nCompleteInfoProvider")
        employee.id = 555
        super.GetInfo(employee)
    }
}

open class CompleteInfoProvider : PrivateInfoProvider() {
    override val numberChildren: Int?
        get() = super.numberChildren
    override val address: String?
        get() = "Magic street 37, Hogwarts, Magic land"
    override fun GetInfo(employee: Employee9) {
        println("In CompleteInfoProvider")
        super.GetInfo(employee)
        println()
    }
}

fun main() {
    val emp = Employee9()
    emp.PrintInfo()

    val info1 = BasicInfoProvider()
    info1.GetInfo(emp)

    val info2 = DepartmentalInfoProvider()
    info2.GetInfo(emp)

    val info3 = PrivateInfoProvider()
    info3.GetInfo(emp)

    if (info3 is IPrivateInfoProvider)
        println("info3 is CompleteInfoProvider")
    else if (info3 is IDepartmentalInfo)

    if (info2 !is IDepartmentalInfo)
        println("info2 is not CompleteInfoProvider")

    val info4 = CompleteInfoProvider()
    info4.GetInfo(emp)

    val info5 = object : CompleteInfoProvider() {
        override fun GetInfo(employee: Employee9) {
            println("In an object expression")
            super.GetInfo(employee)
        }
    }
    info5.GetInfo(emp)
}
