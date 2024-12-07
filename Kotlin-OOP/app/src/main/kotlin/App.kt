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

fun main() {
    val animal = Animal()
    val tiger = BigCats()

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
