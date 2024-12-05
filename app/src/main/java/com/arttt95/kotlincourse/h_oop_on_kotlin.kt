package com.arttt95.kotlincourse

class Jogador {

    var kart = ""
    var pneu = ""
    var planador = ""

    fun acelerar(aceleracao: Int = 10) {
        println("Acelerando a $aceleracao km/h...")
    }

    /*fun retornarPoder(): String {
        return "Pulso Eletromagnético"
    }*/

    fun retornarPoder(): String = "Pulso Eletromagnético"

}

fun main() {

    val jogador = Jogador() // Caixa 01
    jogador.kart = "Clássico"
    jogador.pneu = "Esportivo"
    jogador.planador = "Grande"

    /*jogador = Jogador() // Caixa 02
    jogador.kart = "Rally"
    jogador.pneu = "Terra"
    jogador.planador = "Pequeno"*/

    println(jogador.kart)
    println(jogador.pneu)
    println(jogador.planador)

    jogador.acelerar(aceleracao = 20)

    val poder = jogador.retornarPoder()
    println(poder)

}