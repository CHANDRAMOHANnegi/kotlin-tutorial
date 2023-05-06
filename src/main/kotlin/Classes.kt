fun main() {
    val mustang = Car("mustang", "petrol", 100)
    val beetle = Car("beetle", "diesel", 200)

    println(mustang.name)
    println(beetle.name)

    mustang.driverCar()
    beetle.driverCar()

    val person1 = Person("A",20)
    val person2 = Person("A",10)
    println(person1.canVote())
    println(person2.canVote())
}

class Car(val name: String, val type: String, var kmRan: Int) {
    fun driverCar() {// methods
        println("$name Car is driving")
    }

    fun applyBrakes() {
        println("Applied Brakes")
    }
}

class Person(val name:String, val age: Int) {
    fun canVote(): Boolean {
        return age > 18
    }
}