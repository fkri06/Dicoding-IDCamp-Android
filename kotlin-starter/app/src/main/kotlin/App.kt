package org.dicoding.kotlin.app

import org.dicoding.kotlin.utils.Printer

// This is the main entry point of the application.
// It uses the `Printer` class from the `:utils` subproject.

/*
*
*  If it's divisible by 3 fizz
*  if it's divisible by 5 buzz
*
*  if it's divisible by both fizzBuzz
*
*  otherwise print the numbers
*
*  */
fun fizzBuzz (number: Int) {
    for (i in 1..number) {
        if(i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
        } else if (i % 3 == 0) {
            println("Fizz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else {
            println("$i")
        }
    }
}

enum class Cards(val color: String) {
    DIAMOND("RED"),
    HEART("BLACK")
}

fun daysInWeek(numOfDays: Int){
    when(numOfDays){
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> {
            val greetings: String = "Welcome to days of week program"
            println(greetings)
        }
    }
}

fun main() {
    val text  = "Dicoding"
    val firstChar = text[1]

//    while loop
    var i: Int = 0
    while (i < 4) {
        println("Hello Kotlin $i")
        i++
    }

    var j = 0
    do {
        println("Do while $j")
        j--
    } while (j > 0)

    println(Cards.DIAMOND.color)
    daysInWeek(10)

//    range
    val exampleRange = 1..10
    for (k in exampleRange) {
        println("Example $k")
    }

    val anotherRange = 5  downTo 1
    for (u in anotherRange) {
        println(u)
    }

    for ((index, value) in anotherRange.withIndex()){
        println("$index: $value")
    }

    val unicodeTest = "Unicode test: \u2024"

    println(unicodeTest)

    for (i in 6 downTo 0) {
        println(i)
    }

    for (j in 0..3) {
        println(j)
    }

    println("BREAK")
    for (x in 1.rangeTo(10)){
        if (x == 5){
            break
        } else {
            println(x)
        }
    }

    println("CONTINUE")
    for (s in 10.downTo(1)) {
        if (s % 2 == 0){
            continue
        } else {
            println("$s")
        }
    }

    println("Kotlin is \"Awesome\"")

    val multiline = """
        First
        Name
        Is
        Fikri
    """.trimIndent()

//    string template
    val name = "Kotlin"

    println ("My name is " + name)
    println ("My name is $name")

    val totalPrice: Double = 2.8787

    println("Your total price is $totalPrice")

    val expr: Int = 10

    println("Items bought ${if (expr > 7) "got a discount" else  "No discount"}")

    println(multiline)

    val grade: Int = 40

    if (grade > 90) {
        println("Your letter grade is A")
    } else if (grade > 75 && grade <= 90){
        println("Your letter grade is B")
    } else if (grade > 60 && grade <= 75){
        println("Your letter grade is C")
    } else if (grade > 50 && grade <= 60){
        println("Your letter grade is D")
    } else {
        println("Your letter grade is F. You need to take the class again.")
    }


//    Fizz Buzz
    fizzBuzz(15)

//    numbers
    val largeParticles: Int = 2000000000

    println(largeParticles)
    println(Int.MAX_VALUE)
    println(Long.MAX_VALUE)
    println(Short.MAX_VALUE)
    println(Byte.MAX_VALUE)
    println(Double.MAX_VALUE)
    println(Float.MAX_VALUE)

//    array
    val array = arrayOf(1, 2, 3, 4, 5)
    for (item in array) {
        println(item)
    }

    val someArray = arrayOf("123", 111, 3.44, 'c')

    for (item in someArray) {
        println(item)
    }


//    nullable

    val someText: String? = null
    println(someText?.length)
    val someTextLength = someText?.length ?: 9
    println(someTextLength)
    println(text.length)

//    function
    setUser("Fikri", 50)

    val fact: Int = factorial(5)
    println(fact)

    println(kotlinFunction("Fikri", 20))
    println(setUserExpressionBody("Fikri", 19))

    val num = exampleVararg(name ="fikri", 1, 2, 3, 4, 5)
    println(num)
}

fun setUser(name: String, age: Int) {
    println("My name is $name and I'm $age years of age.")
}

fun factorial(n: Int): Int {
    if (n == 0) return 1
    return n * factorial(n - 1)
}

fun kotlinFunction(name: String, age: Int) {
    println("Name $name is $age years of age")
}

fun setUserExpressionBody(name: String, age: Int): String = "My name is $name and I'm $age"

fun exampleVararg( name: String, vararg number: Int): Int{
    println("hey $name")
    println(number)
    return number.sum()
}