enum class BrandName {
    Bmw, Mercedes, Tesla;
    fun GetBrandName() = name
}

object Factory {
    fun GetName(n: BrandName) : String {
        val brand = when (n) {
            BrandName.Bmw -> "Bmw"
            BrandName.Mercedes -> "Mercedes"
            BrandName.Tesla -> "Tesla"
        }
        return brand
    }
    fun CTruck(name: BrandName) = Truck(GetName(name), 4, 20)
    fun CETruck(name: BrandName) = Truck(name.GetBrandName(), 8, 0)
}

class Truck constructor(val brand: String, val ntyres: Int, val nCylinders: Int) {
    override fun toString(): String {
        return "Brand:$brand, Number of types=$ntyres, Cylinders=$nCylinders"
    }
}

fun main() {
    val combusionTruck = Factory.CTruck(BrandName.Bmw)
    println(combusionTruck)

    val electricTruck = Factory.CETruck(BrandName.Tesla)
    println(electricTruck)
}



