fun main() {
    val car = Automobile("Car", 4, 5, "Petrol")
    val car2 = Automobile("Car2", "Petrol")

//    val car3=Automobile()

    var man = Man("A", 18)
    println(man.age)
    println(man.name)
}

class Automobile(val name: String, val types: Int, val maxSeating: Int, val engineType: String) {
    init {
        println("$name is created")
    }

    fun drive() {}

    init {
        println("2nd init block")
    }

    fun applyBrakes() {}

    constructor(nameParam: String, engineParam: String) :
            this(nameParam, 4, 5, engineParam)
}


class Empty {

}

class Man(nameParam: String, ageParam: Int) {
    val name = nameParam
    var age = ageParam
}
