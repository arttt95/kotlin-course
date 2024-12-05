package com.arttt95.kotlincourse

class Carro {

    var cor: String = "Vermelho"

    fun acelerar() {

        // Lógica

    }
}

fun main() {

    var carro: Carro? = null
//    carro = Carro()

//    val cor = carro?.cor ?: "cor padrão"
    println(carro?.cor)

}

