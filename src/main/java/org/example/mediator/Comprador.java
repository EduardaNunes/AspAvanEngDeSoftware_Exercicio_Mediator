package org.example.mediator;

public class Comprador {

    public String fazerPedido(String pedido) {
        return Marketplace.getInstancia().receberPedidoParaVendedor(pedido);
    }

    public String solicitarCancelamento(String pedido) {
        return Marketplace.getInstancia().receberSolicitacaoDeCancelamentoParaVendedor(pedido);
    }

    public String fazerReclamacao(String mensagem) {
        return Marketplace.getInstancia().receberReclamacaoParaVendedor(mensagem);
    }

}
