package com.arttt95.kotlincourse

/*
abstract class Animal */
/*constructor(
    private var nome: String = "",
    private var cor: String = "",
    private var tamanho: Int = 0, // 1 -> P, 2 -> M, 3 -> G
    private var peso: Double = 0.0
)*//*
 { // Classe Pai ou Superclasse

    init {
//        println("Objeto iniciado")
    }

    abstract fun dormir() */
/*= println("O animal está dormindo...") // Inline*//*


    open fun correr() = println("Correndo como um ") // Inline

}

class Cachorro: Animal() { // Subclasse ou Classe Filha -> Agora Classe Concreta
    public fun latir() = println("O cachorro está latindo...")

    override fun correr() {
        super.correr()
        println("cachorro com 4 patas")
    }

    override fun dormir() {
        println("O cachorro está dormindo na casinha...")
    }
}

class Passaro: Animal() { // Subclasse ou Classe Filha -> Agora Classes Concreta
    public fun voar() = println("O passaro está voando...")

    override fun correr() {
        super.correr()
        println("passáro com 2 pernas")
    }

    override fun dormir() {
        println("O passáro está dormindo na árvore...")
    }
}

fun main() {

    */
/*val animal = Animal() // Uma classe abstrata não deve ser instânciada
    animal.correr()*//*


    */
/*val animal = Animal("Snoop", "Marrom", 2, 580.5)

    animal.dormir()
    animal.correr()*//*


    val dog = Cachorro()
    dog.latir()
    dog.correr()

    */
/*println("\n")

    val bird = Passaro()
    bird.voar()
    bird.correr()*//*



}










*/
