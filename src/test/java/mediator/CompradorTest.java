package mediator;

import org.example.mediator.Comprador;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompradorTest {

    @Test
    void deveFazerPedidoParaVendedor() {
        Comprador comprador = new Comprador();
        String pedido = "Giz de cera com 12 cores";
        assertEquals("O Marketplace X agradece seu contato.\nO Vendedor respondeu seu pedido conforme mensagem a seguir.\n" +
                        ">>O vendedor recebeu o pedido: " + pedido,
                comprador.fazerPedido(pedido));
    }

    @Test
    void deveEnviarSolicitacaoDeCancelamentoParaVendedor() {
        Comprador comprador = new Comprador();
        String pedido = "Kit de pratos";
        assertEquals("O Marketplace X agradece seu contato.\nO Vendedor respondeu sua solicitação de cancelamento conforme mensagem a seguir.\n" +
                        ">>O vendedor recebeu o cancelamento do pedido: " + pedido,
                comprador.solicitarCancelamento(pedido));
    }

    @Test
    void deveFazerReclamacaoParaVendedor() {
        Comprador comprador = new Comprador();
        String mensagem = "O tecido da blusa poderia ser melhor.";
        assertEquals("O Marketplace X agradece seu contato.\nO Vendedor respondeu sua reclamação conforme mensagem a seguir.\n" +
                        ">>O vendedor recebeu a reclamacao: " + mensagem,
                comprador.fazerReclamacao(mensagem));
    }

}
