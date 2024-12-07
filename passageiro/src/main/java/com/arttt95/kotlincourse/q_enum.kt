package com.arttt95.kotlincourse

/*// -> aguardando_aprovacao
// -> pedido_realizado
// -> pagamento_confirmado
// -> pedido_enviado
// -> pedido_entregue

enum class StatusPedido {
    AGUARDANDO_APROVACAO, // ordinal -> 0
    PEDIDO_REALIZADO, // ordinal -> 1
    PAGAMENTO_CONFIRMADO, // ordinal -> 2
    PEDIDO_ENVIADO, // ordinal -> 3
    PEDIDO_ENTREGUE // ordinal -> 4
}

class Pedido (
    var total: Double = 0.0,
    var itens: String = "",
    var statusPedido: StatusPedido = StatusPedido.AGUARDANDO_APROVACAO
){


}*/

fun main() {

    /*// Tela FINALIZAR COMPRA
    val pedido = Pedido(125.90, "Camiseta, Livro")

    // Pagamento com Cartão
    pedido.statusPedido = StatusPedido.PEDIDO_REALIZADO

    // Transportadora
    pedido.statusPedido = StatusPedido.PEDIDO_ENVIADO
    println("StatusPedido: ${StatusPedido.PEDIDO_ENVIADO.ordinal}")


    // Histórico de Compras
    if (pedido.statusPedido == StatusPedido.AGUARDANDO_APROVACAO) {

        println("Seu pedido ainda aguardando aprovação, " +
                "assim que for aprovado seguirá para o envio")

    } else if (pedido.statusPedido == StatusPedido.PEDIDO_REALIZADO) {

        println("Seu pedido foi realizado com sucesso!")

    } else if (pedido.statusPedido == StatusPedido.PAGAMENTO_CONFIRMADO) {

        println("O seu pagamento foi confirmado com sucesso!")

    } else if (pedido.statusPedido == StatusPedido.PEDIDO_ENVIADO) {

        println("Seu pedido já foi enviado e já está com a transportadora!")

    } else if (pedido.statusPedido == StatusPedido.PEDIDO_ENTREGUE) {

        println("Seu pedido foi entregue com sucesso!")

    } else {

        println("Houve um erro no carregamento, por favor retorne mais tarde.")

    }*/


}