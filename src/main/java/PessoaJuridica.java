public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private int numeroParcela=1;

    public int getNumeroParcela() {
        return numeroParcela;
    }

    public void setNumeroParcela(int numeroParcela) {
        this.numeroParcela = numeroParcela;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public float calcularParcela(){
        if (numeroParcela == 0 ) {
            throw new IllegalArgumentException("Parcela tem que ser superir a zero");
        }
        else {
            float v = this.calcularDesconto()/this.numeroParcela;
            return v;
     }

    }


    @Override
    public String getTipo() {
        return "Pessoa Juridica";
    }

    @Override
    public String documentacao() {
        return  "CNPJ: " + this.cnpj+
                ", Pagamento Apos 90 dias em "+ this.numeroParcela+ "X de " +calcularParcela();

    }
}
