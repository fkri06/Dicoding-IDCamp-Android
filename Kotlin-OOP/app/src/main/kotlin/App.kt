package org.dicoding.kotlin.app

import org.dicoding.kotlin.utils.Printer

// This is the main entry point of the application.
// It uses the `Printer` class from the `:utils` subproject.

class Animal() {
//   Attributes/Properties of a class
    var name: String = "Kucing"
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

fun main() {
}
