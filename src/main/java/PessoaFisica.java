public class PessoaFisica extends Pessoa{
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String documentacao() {
        return "CPF: " + this.cpf;
    }

    @Override
    public String getTipo() {
        return "Pessoa Fisica";
    }
}
