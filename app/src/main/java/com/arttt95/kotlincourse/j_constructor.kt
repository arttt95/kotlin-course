package com.arttt95.kotlincourse

class Usuario constructor(
    private var nome: String = "",
    private var sobrenome: String = ""
) { // Construtor Primário

    init { // Inicializar

        println("Objeto inicializado\n")

        println("Nome: $nome | Sobrenome: $sobrenome")
    }

    constructor(nome: String): this(nome, "") { // Construtor secundário
        println("Construtor secundário | Nome: $nome")
    }

}

fun main() {

//    val usuario = Usuario("Cristiano", "Penaldo")
    val usuario = Usuario("Cristiano")
//    usuario.nome = "Penaldo"

}