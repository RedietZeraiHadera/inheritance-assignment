fun main(){
val car = Car("Bugatti","Mistral 2022","Brown",8)
    car.carry(1,10)
    car.identity()
   println( car.calculateParkingFees(2))
    val bus = Car.Bus("Lion","new","Yellow",8)
     println(bus.maxTripFare(3.5))
    println(bus.calculateParkingFees(8))


}
open class Car (var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people: Int,capacity:Int) {

        var x = people-capacity
        if    (people<=capacity){
            println("carrying $capacity of people ")}
        else{ println("over capacity by $x people")}

    }
    fun identity(){
        println("I am a $color $make $model")

    }
    open fun calculateParkingFees(hours:Int):Int{
        var fees = hours*20
        return fees

    }
    class Bus( make:String,model:String, color:String, capacity:Int):Car(make,model,color, capacity){
       fun maxTripFare(fare: Double):Double{
            println(fare*capacity)
            return (fare*capacity)
            }

       override fun calculateParkingFees(hours: Int) :Int{
           return hours*capacity
       }
        }
    }

