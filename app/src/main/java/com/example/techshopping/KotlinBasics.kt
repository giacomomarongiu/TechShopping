package com.example.techshopping

fun main(){
    //Lista non mutabile
    //val shoppigList = listOf("Pippo","Pluto", "Paperino", "Pippo Baudo")
    //Non posso fare .add

    //Lista mutabile posso aggiungere e modificare
    val shoppigList = mutableListOf("Pippo","Pluto", "Paperino", "Pippo Baudo")

    //Aggiugere un elemento
    shoppigList.add("Pippo Franco")
    shoppigList.remove(element = "Paperino")
    shoppigList.add("Paperina")
println(shoppigList)

    shoppigList.removeAt(1)
    println(shoppigList)
var isItInside = shoppigList.contains("Pippo")

    if (isItInside){
        println("E' presente")
    }
    shoppigList.add(2,"Raffaello")
    println(shoppigList)

}