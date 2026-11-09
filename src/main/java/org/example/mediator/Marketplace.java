package org.example.mediator;

public class Marketplace {

    private static Marketplace instancia = new Marketplace();

    private Marketplace() {}

    public static Marketplace getInstancia() {
        return instancia;
    }

    public String receberPedidoParaVendedor(String pedido) {
        return "O Marketplace X agradece seu contato.\n"+
                "O Vendedor respondeu seu pedido conforme mensagem a seguir.\n" +
                ">>" + Vendedor.getInstancia().receberPedido(pedido);
    }

    public String receberSolicitacaoDeCancelamentoParaVendedor(String pedido) {
        return "O Marketplace X agradece seu contato.\n"+
                "O Vendedor respondeu sua solicitação de cancelamento conforme mensagem a seguir.\n" +
                ">>" + Vendedor.getInstancia().receberCancelamento(pedido);
    }

    public String receberReclamacaoParaVendedor(String mensagem) {
        return "O Marketplace X agradece seu contato.\n"+
                "O Vendedor respondeu sua reclamação conforme mensagem a seguir.\n" +
                ">>" + Vendedor.getInstancia().receberReclamacao(mensagem);
    }

}
