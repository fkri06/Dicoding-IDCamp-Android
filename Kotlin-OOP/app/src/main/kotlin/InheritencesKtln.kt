package org.dicoding.kotlin.app

open class AnimalParentClass(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean) {
    open fun eat() {
        println("$name eat")
    }

    open fun sleep() {
        println("$name sleep")
    }
}

class Dog(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean) : AnimalParentClass(pName, pWeight, pAge, pIsCarnivore ) {
    override fun eat() {
        super.eat()
        println("$name eating dog food")
    }
}

class Cat(
    val pName: String,
    val furColor: String,
    val pWeight: Double,
    val pAge: Int,
    val pLegs: Int,
    val pIsCarnivore: Boolean
) : AnimalParentClass(pName, pWeight, pAge, pIsCarnivore)
{
    fun playWithHumans() {
        println("$name play with humans")
    }

    override fun eat() {
        println("$name eat")
    }

    override fun sleep() {
        println("$name sleep")
    }
}