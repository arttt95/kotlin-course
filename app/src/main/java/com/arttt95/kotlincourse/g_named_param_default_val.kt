package com.arttt95.kotlincourse

fun somarDois (a: Int, b: Int = 0, c: Int = 0) {
    println(a + b + c)
}

fun main() {
//    somarDois(0, c = 10)
    somarDois(b = 10, a = 2) // 'a' é obrigatório
}