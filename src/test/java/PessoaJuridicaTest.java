import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaJuridicaTest {
    @Test
    void deveRetornarInformacoesComoDescontoParcelado() {
        PessoaJuridica pessoa = new PessoaJuridica();
        pessoa.setId(1);
        pessoa.setNome("Joao");
        pessoa.setValorCompra(100.0f);
       pessoa.setDesconto(0.9F);
       pessoa.setNumeroParcela(2);
        pessoa.setCnpj("00.000.000/0001-00");
        assertEquals("Pessoa Juridica(id:1, nome= Joao, valor Compra: 100.0, valor com desconto: 90.0, CNPJ: 00.000.000/0001-00, Pagamento Apos 90 dias em 2X de 45.0)", pessoa.getInfo());
    }
    @Test
    void deveRetornarInformacoesComDescontoSemParcela() {
        PessoaJuridica pessoa = new PessoaJuridica();
        pessoa.setId(1);
        pessoa.setNome("Joao");
        pessoa.setValorCompra(100.0f);
        pessoa.setDesconto(0.9F);

        pessoa.setCnpj("00.000.000/0001-00");
        assertEquals("Pessoa Juridica(id:1, nome= Joao, valor Compra: 100.0, valor com desconto: 90.0, CNPJ: 00.000.000/0001-00, Pagamento Apos 90 dias em 1X de 90.0)", pessoa.getInfo());
    }

    @Test
    void deveRetornarInformacoesSemDescontoSemParcela() {
        PessoaJuridica pessoa = new PessoaJuridica();
        pessoa.setId(1);
        pessoa.setNome("Joao");
        pessoa.setValorCompra(100.0f);
        pessoa.setCnpj("00.000.000/0001-00");
        assertEquals("Pessoa Juridica(id:1, nome= Joao, valor Compra: 100.0, valor com desconto: 100.0, CNPJ: 00.000.000/0001-00, Pagamento Apos 90 dias em 1X de 100.0)", pessoa.getInfo());
    }
}