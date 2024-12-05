package com.arttt95.kotlincourse

class Usuario {

    // Atributos

    // Métodos
    // Assinaturas de métodos são compostas por seu nome + parâmetro e seus tipos
    fun logar(email: String, senha: String) {
        println("Usuário logado com o email: $email e senha: $senha")
    }

    fun logar(cpf: Long, senha: Int) {
        println("Usuario logado com o CPF: $cpf e senha: $senha")
    }

}

fun main() {

    val usuario = Usuario()
//    usuario.logar("papai-cris@gmail.com", "7777")
    usuario.logar(99911199911, 7777)
}