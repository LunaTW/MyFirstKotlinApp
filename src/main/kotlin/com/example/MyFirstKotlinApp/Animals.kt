package com.example.MyFirstKotlinApp

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class MyFirstKotlinAppApplication

fun main(args: Array<String>) {
    val hippo = Hippo()
    println(hippo.image)
    println(hippo.hunger)
    println(hippo.makeNoise())

}

open class Animal {
    open var image = ""
    open val food = ""
    open val habitat = ""
    var hunger = 10

    open fun makeNoise() {
        println("The Animal is making a noise")
    }

    open fun eat() {
        println("The Animal is eating")
    }

    open fun roam() {
        println("The Animal is roaming")
    }

    fun sleep() {
        println("The Animal is sleeping")
    }
}

class Hippo : Animal(){
    init{
        image = "Hippo.jpg"
    }

//    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    fun trys(){
        println("try")
    }
}