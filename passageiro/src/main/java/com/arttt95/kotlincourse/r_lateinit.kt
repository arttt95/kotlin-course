package com.arttt95.kotlincourse

// 1 -> Valor; 2 -> Valor null; 3 -> LATEINIT
class Produto {

    lateinit var descricao: String

}

fun main() {

    val produto = Produto()
//    println(produto.descricao)
    produto.descricao = "Notebook Dell G3 3590"

    println(produto.descricao)

}