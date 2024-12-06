package com.arttt95.kotlincourse

interface Presidenciavel {
    fun cadidatarSe() {

    }
}

abstract class Pessoa {

    fun comer() {
        println("Comendo...")
    }

}

class DevAndroid : Pessoa() {
    fun programar() {
        println("Programando...")
    }
}

class DevWeb : Pessoa() {
    fun programar() {
        println("Programando...")
    }
    
    fun candidatarSe() {
        
    }
}

class Jornalista : Pessoa(), Presidenciavel {
    fun escreverNoticia() {
        println("Escrevendo notícias...")
    }

    fun candidatarSe() {
        println("Candidatando-se...")
    }
}

class FuncPublico : Pessoa() {

}


fun main() {

    val devAndroid = DevAndroid()
    devAndroid.comer()

    println("------------")

    val devWeb = DevWeb()
    devWeb.comer()

    println("------------")

    val jornalista = Jornalista()
    jornalista.comer()
    jornalista.candidatarSe()

    println("------------")

    val funcPublico = FuncPublico()
    funcPublico.comer()

}