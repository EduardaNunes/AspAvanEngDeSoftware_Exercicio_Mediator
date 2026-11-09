package org.example.mediator;

public class Comprador {

    public String fazerPedido(Produto produto) {
        return Marketplace.getInstancia().receberPedidoParaVendedor(produto);
    }

    public String solicitarCancelamento(Produto produto) {
        return Marketplace.getInstancia().receberSolicitacaoDeCancelamentoParaVendedor(produto);
    }

    public String fazerReclamacao(Produto produto, String mensagem) {
        return Marketplace.getInstancia().receberReclamacaoParaVendedor(produto, mensagem);
    }

}
