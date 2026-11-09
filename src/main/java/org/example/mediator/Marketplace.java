package org.example.mediator;

public class Marketplace {

    private static Marketplace instancia = new Marketplace();

    private Marketplace() {}

    public static Marketplace getInstancia() {
        return instancia;
    }

    public String receberPedidoParaVendedor(Produto produto) {
        return "O Marketplace X agradece seu contato.\n"+
                "O Vendedor respondeu seu pedido conforme mensagem a seguir.\n" +
                ">>" + produto.getVendedor().receberPedido(produto);
    }

    public String receberSolicitacaoDeCancelamentoParaVendedor(Produto produto) {
        return "O Marketplace X agradece seu contato.\n"+
                "O Vendedor respondeu sua solicitação de cancelamento conforme mensagem a seguir.\n" +
                ">>" + produto.getVendedor().receberCancelamento(produto);
    }

    public String receberReclamacaoParaVendedor(Produto produto, String mensagem) {
        return "O Marketplace X agradece seu contato.\n"+
                "O Vendedor respondeu sua reclamação conforme mensagem a seguir.\n" +
                ">>" + produto.getVendedor().receberReclamacao(produto, mensagem);
    }

}
