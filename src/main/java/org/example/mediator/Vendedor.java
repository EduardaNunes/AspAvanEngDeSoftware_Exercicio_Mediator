package org.example.mediator;

public class Vendedor {

    public Vendedor(){};

    public String receberPedido(Produto produto) {
        return "O vendedor recebeu o pedido: " + produto.getNome();
    }

    public String receberCancelamento(Produto produto) {
        return "O vendedor recebeu o cancelamento do pedido: " + produto.getNome();
    }

    public String receberReclamacao(Produto produto, String mensagem) {
        return "O vendedor recebeu a reclamacao: '" + mensagem + "', para o produto: " + produto.getNome();
    }

}
