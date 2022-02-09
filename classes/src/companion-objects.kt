interface ISenselessInterface {
    fun SetNumTyres(n: Int)
    fun GetNumTyres() : Int
}

class Vehicle private constructor(val tyres: Int, val sportsMode: Boolean) {
    companion object CreateIt : ISenselessInterface {
        override fun SetNumTyres(n: Int) {
            TODO("Not yet implemented")
        }
        override fun GetNumTyres(): Int {
            return 555;
        }
        fun CreateBmw() : Vehicle {
            return Vehicle(4, true)
        }
        fun CreateFord() : Vehicle {
            return Vehicle(4, false)
        }
        fun CreateVespa() : Vehicle {
            return Vehicle(2, false)
        }
    }
}

class Car private constructor(val tyres: Int, val sportsMode: Boolean) {
    companion object CreateCar {
        fun CreateBmw() : Car {
            return Car(4, true)
        }
        fun CreateFord() : Car {
            return Car(4, false)
        }
        fun CreateVespa() : Car {
            return Car(2, false)
        }
    }
}

fun main() {
    val bmw = Car.CreateBmw()
    val bmw1 = Car.CreateCar.CreateBmw()
    val ford = Car.CreateFord()
    val vespa = Car.CreateVespa()

    val bmw2 = Vehicle.CreateBmw()
    val bmw3 = Vehicle.CreateIt.CreateBmw()
    val ford2 = Vehicle.CreateFord()
    val vespa2 = Vehicle.CreateVespa()
}