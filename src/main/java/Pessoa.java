public abstract class Pessoa {
    private int id;
    protected String nome;
    private float valorCompra;
    private int desconto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public float calcularDesconto(){
        float v = this.valorCompra * (1 - (this.desconto / 100));
        return v;
    }


    public abstract String documentacao();

    public String getTipo() {
        return "Pessoa";
    }

    public String getInfo() {
        return getTipo() + "(" +
                "id:" + this.id +
                ", nome= " + this.nome +
                ", valor Compra: " + this.valorCompra +
                ", valor com desconto: " + this.calcularDesconto() +
                ", " + this.documentacao() +
                ')';
    }
}
