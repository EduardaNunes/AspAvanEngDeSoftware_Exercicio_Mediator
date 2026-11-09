package mediator;

import org.example.mediator.Comprador;
import org.example.mediator.Produto;
import org.example.mediator.Vendedor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompradorTest {

    @Test
    void deveFazerPedidoParaVendedor() {
        Comprador comprador = new Comprador();
        Vendedor vendedor = new Vendedor();

        String nomeProduto = "Giz de cera com 12 cores";
        Produto produto = new Produto(nomeProduto, vendedor);

        assertEquals("O Marketplace X agradece seu contato.\nO Vendedor respondeu seu pedido conforme mensagem a seguir.\n" +
                        ">>O vendedor recebeu o pedido: " + nomeProduto,
                comprador.fazerPedido(produto));
    }

    @Test
    void deveEnviarSolicitacaoDeCancelamentoParaVendedor() {
        Comprador comprador = new Comprador();
        Vendedor vendedor = new Vendedor();

        String nomeProduto = "Kit de pratos";
        Produto produto = new Produto(nomeProduto, vendedor);

        assertEquals("O Marketplace X agradece seu contato.\nO Vendedor respondeu sua solicitação de cancelamento conforme mensagem a seguir.\n" +
                        ">>O vendedor recebeu o cancelamento do pedido: " + nomeProduto,
                comprador.solicitarCancelamento(produto));
    }

    @Test
    void deveFazerReclamacaoParaVendedor() {
        Comprador comprador = new Comprador();
        Vendedor vendedor = new Vendedor();

        String nomeProduto = "Blusa Manga Comprida";
        Produto produto = new Produto(nomeProduto, vendedor);
        String mensagem = "O tecido poderia ser melhor, pinica muito!";

        assertEquals("O Marketplace X agradece seu contato.\nO Vendedor respondeu sua reclamação conforme mensagem a seguir.\n" +
                        ">>O vendedor recebeu a reclamacao: '" + mensagem + "', para o produto: " + nomeProduto,
                comprador.fazerReclamacao(produto, mensagem));
    }

}
