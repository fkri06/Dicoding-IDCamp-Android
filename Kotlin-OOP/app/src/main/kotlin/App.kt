package org.dicoding.kotlin.app

import org.dicoding.kotlin.utils.Printer
import org.dicoding.kotlin.app.DelegateName

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

fun main() {
    val animal = Animal()
    val tiger = BigCats()

    val toyota = Car("Toyota", "467", 75)
    val boeing = Airplane("Boeing", "356", 25.5)

    toyota.info()
    boeing.info()

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
}
