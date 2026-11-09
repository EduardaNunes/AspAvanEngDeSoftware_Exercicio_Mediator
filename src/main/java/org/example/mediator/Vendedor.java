package org.example.mediator;

public class Vendedor {

    private static Vendedor instancia = new Vendedor();

    private Vendedor() {}

    public static Vendedor getInstancia() {
        return instancia;
    }

    public String receberPedido(String pedido) {
        return "O vendedor recebeu o pedido: " + pedido;
    }

    public String receberCancelamento(String pedido) {
        return "O vendedor recebeu o cancelamento do pedido: " + pedido;
    }

    public String receberReclamacao(String mensagem) {
        return "O vendedor recebeu a reclamacao: " + mensagem;
    }

}
