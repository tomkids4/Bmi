package com.example.lib

fun main(){
    val p = Person()
    p.weight = 65f
    p.height = 1.7f
    println("Your bmi is ${p.getbmi()}")
}
class Person {
    var weight: Float = 0f
    var height: Float = 0f
    fun getbmi():Float{
        var bmi = weight/(height*height)
        return bmi
    }
}
