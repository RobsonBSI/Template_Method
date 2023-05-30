public class pessoaJuridica  extends Pessoa{
    private String cnpj;
    private int parcelas;
    private float valorParcela;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public float getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(float valorParcela) {
        if ( parcelas > 1){
            this.valorParcela = this.calcularDesconto()/parcelas;
        }else {
            this.valorParcela = this.calcularDesconto();
        }

    }

    @Override
    public String documentacao() {
        return  "CNPJ: " + this.cnpj+
                "Pagamento Apos 90 dias em :" + this.parcelas+
                " de " +this.valorParcela;

    }
}
