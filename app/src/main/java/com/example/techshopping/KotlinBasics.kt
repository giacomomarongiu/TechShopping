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
//println(shoppigList)

    shoppigList.removeAt(1)
    //println(shoppigList)
    var isItInside = shoppigList.contains("Pippo")

    if (isItInside){
        println("E' presente")
    }
    shoppigList.add(2,"Raffaello")
    //println(shoppigList)

    println(shoppigList.size)
    //equivalente a lenght in JS
    for(index in 0 until shoppigList.size){
        //Così stampiamo i numeri (gli indici)
        println(index)
        println(shoppigList[index])
        println("il signor ${shoppigList[index]} ha indice ${index}")

        /*  if (item=="Raffaello"){
              shoppigList.removeFirst()
              println(shoppigList)
              break
          } */
    }
    //stessa cosa ma con indice fisso
    for(index in 0 until 2){
        //Così stampiamo i numeri (gli indici)
        println(index)
        println(shoppigList[index])
        println("il signor ${shoppigList[index]} ha indice ${index}")

    }
    //stessa cosa ma con indice incluso
    for(index in 0 .. 2){
        //Così stampiamo i numeri (gli indici)
        println(index)
        println(shoppigList[index])
        println("il signor ${shoppigList[index]} ha indice ${index}")

    }
}