fun main() {
    var magari=Vehicle("Toyota","Crown","Silver",5)

//    Vehicle Car
    var gari=Car("Subaru","Legacy","white",5)
    gari.identity()
    println(gari.calculateParkingFees(2))
   gari.carry(7)

//    Vehicle Bus
    var nganya=Bus("Isuzu","Dmax","White",52)
   println(nganya.calculateParkingFees(3))
println(nganya.maxTripFare(60.00))

}
open class Vehicle(var make:String,var model:String,var color:String,var capacity:Int) {
    open fun carry(people: Int) {
        println("This vehicle cannot exceed the maximum number of people.")
    }

    open fun identity() {
        println("This vehicle is expensive and it needs to be handled with care.")

    }

    open fun calculateParkingFees(hours: Int): Int {
        return hours * 20
    }
}
    class Car(make: String, model: String, color: String, capacity: Int) : Vehicle(make, model, color, capacity) {
        override fun carry(people: Int) {
            var x = people - capacity
            if (people <= capacity) {
                println("carrying $people passengers.")
            } else {
                println("Over capacity by $x people")
            }
        }
        override fun identity() {
            println("I am a $color $make $model")
        }
        override fun calculateParkingFees(hours: Int): Int {
            return hours * 20
        }
    }
    class Bus(make:String, model:String,color:String,capacity:Int):Vehicle(make,model,color,capacity) {
        fun maxTripFare(fare: Double) :Double{
        return fare*capacity
        }

        override fun calculateParkingFees(hours: Int): Int {
            return hours * capacity
        }
}