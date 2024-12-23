package org.dicoding.kotlin.app

import org.dicoding.kotlin.utils.Printer
import org.dicoding.kotlin.app.DelegateName
import org.dicoding.kotlin.app.*


// This is the main entry point of the application.
// It uses the `Printer` class from the `:utils` subproject.

class Animal() {
//   Attributes/Properties of a class
    var name: String = "Kucing"
        get() {
            return field
        }
        set(value: String) {
            field = value
        }
    var weight: Double = 2.4
    var age: Int = 2
    var isMammal: Boolean = true

//    Behaviors/Method of a class

    fun eat() {
        println("$name eat")
    }

    fun sleep() {
        println("$name sleep")
    }

}

class BigCats() {
    var nameOfSpecies: Any by DelegateName()
    var colorOfSpecies: Any by DelegateName()
    var speciesNumberInWilderness: Any by DelegateName()

    fun roar(){
        println("raaaawwwwrrrrrr")
    }

    fun hunt(){
        println("hunting")
    }

    fun sleep() {
        println("sleep")
    }
}

lateinit var name: String
val myName: String by lazy{
    "Fikri Aqsha"
}

class Car(var brand: String, var model: String, var stock: Int, var color: String = "Blue") {
    fun info() {
        println("Brand Name: ${this.brand}")
        println("Brand Model: $model")
        println("Brand Stock: $stock")
        println("Brand Color: $color")
    }
}

class Airplane(companyName:String, model: String, price: Double) {
    val companyName: String
    val model: String
    val price: Double

    init {
        this.companyName = companyName
        this.model = model
        this.price = if (price < 0) 0.0 else price
    }

    fun info() {
        println("Company Name: ${this.companyName}")
        println("Model: ${this.model}")
        println("Price: ${this.price}")
    }
}

class AnotherAnimal(
    private var name: String,
    private var age: Int,
    private var weight: Double,
    private var isMammal: Boolean,
) {

    fun getName(): String {
        return this.name
    }

    fun setName(name: String) {
        this.name = name
    }

}

class AnimalPolymorphism(private var name: String) {
    fun eat() {
        println("$name eat")
    }

    fun eat(typeOffood: String) {
        println("$name eat $typeOffood")
    }

    fun eat(typeOffood: String, quantity: Int) {
        println("$name eat $quantity quantity of $typeOffood")
    }

    fun sleep() {
        println("$name sleep")
    }
}

fun main() {
    val animal = Animal()
    val tiger = BigCats()

    println("Function overloading to achieve polymorphism")
    val croc: AnimalPolymorphism = AnimalPolymorphism("Kevin the Crocs")
    croc.eat()
    croc.eat("Meat")
    croc.eat("Deer meat", 1)
    println()

    val toyota = Car("Toyota", "467", 75)
    val boeing = Airplane("Boeing", "356", 25.5)

    toyota.info()
    boeing.info()

    println("Access Modifier")
    val anotherAnimal: AnotherAnimal = AnotherAnimal("Timmy", 2, 2.5, true)
    println(anotherAnimal.getName())
    println(anotherAnimal)
    anotherAnimal.setName("Rommy")
    println(anotherAnimal.getName())
    println(anotherAnimal)

    tiger.nameOfSpecies = "Sumatran Tiger"
    tiger.colorOfSpecies = "Orange and Brown strips"
    tiger.speciesNumberInWilderness = 1000

    println(tiger.nameOfSpecies)
    println(tiger.colorOfSpecies)
    println(tiger.speciesNumberInWilderness)

    println(animal.name)
    animal.name = "Dog"
    println(animal.name)

    animal.eat()
    animal.sleep()

//    lateinit and lazy
    name = "Fikri"
    println(name)
    println(myName)

    println("Inheritances")
    var cat: Cat = Cat("Larry", "Orange", 2.5, 3, 4, true)
    cat.eat()

    var dog: Dog = Dog("Jack", 2.4, 4, true)
    dog.eat()
}
