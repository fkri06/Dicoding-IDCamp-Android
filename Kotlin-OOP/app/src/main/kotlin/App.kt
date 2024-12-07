package org.dicoding.kotlin.app

import org.dicoding.kotlin.utils.Printer

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

lateinit var name: String
val myName: String by lazy{
    "Fikri Aqsha"
}

fun main() {
    val animal = Animal()

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
