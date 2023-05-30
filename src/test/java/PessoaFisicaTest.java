import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaFisicaTest {
    @Test
    void deveRetornarInformacoesPessoaComdesconto() {
        PessoaFisica pessoa = new PessoaFisica();
        pessoa.setId(1);
        pessoa.setNome("Joao Pedro");
        pessoa.setValorCompra(100.0f);
        pessoa.setDesconto(0.9F);
        pessoa.setCpf("000.000.000-00");
        assertEquals("Pessoa Fisica(id:1, nome= Joao Pedro, valor Compra: 100.0, valor com desconto: 90.0, CPF: 000.000.000-00)", pessoa.getInfo());
    }

    @Test
    void deveRetornarInformacoesPessoaSemdesconto() {
        PessoaFisica pessoa = new PessoaFisica();
        pessoa.setId(1);
        pessoa.setNome("Joao Pedro");
        pessoa.setValorCompra(100.0f);
        pessoa.setCpf("000.000.000-00");
        assertEquals("Pessoa Fisica(id:1, nome= Joao Pedro, valor Compra: 100.0, valor com desconto: 100.0, CPF: 000.000.000-00)", pessoa.getInfo());
    }

}