package org.example.mediator;

public class Comprador {

    public String fazerPedido(String mensagem) {
        return Marketplace.getInstancia().receberPedidoParaVendedor(mensagem);
    }

    public String solicitarCancelamento(String mensagem) {
        return Marketplace.getInstancia().receberSolicitacaoDeCancelamentoParaVendedor(mensagem);
    }

    public String fazerReclamacao(String mensagem) {
        return Marketplace.getInstancia().receberReclamacaoParaVendedor(mensagem);
    }

}
