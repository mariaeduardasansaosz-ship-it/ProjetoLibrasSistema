package modelTest;

import model.Proposta;
import org.junit.Test;
import static org.junit.Assert.*;

public class PropostaTest {

    @Test
    public void testCalcularValorComDescontoSucesso() {
        // Cenário: Proposta com valor de R$ 1000.00
        Proposta proposta = new Proposta("Evento Libras", "Prefeitura", "20/08/2026", 1000.00, "Aprovado", 1);
        
        // Ação: Aplicar 10% de desconto (deve resultar em R$ 900.00)
        double valorComDesconto = proposta.calcularValorComDesconto(10.0);
        
        // Validação
        assertEquals(900.00, valorComDesconto, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalcularValorComDescontoInvalido() {
        // Cenário: Proposta com valor de R$ 1000.00
        Proposta proposta = new Proposta("Evento Libras", "Prefeitura", "20/08/2026", 1000.00, "Aprovado", 1);
        
        // Ação: Tentar aplicar desconto negativo (deve lançar exceção)
        proposta.calcularValorComDesconto(-5.0);
    }
}