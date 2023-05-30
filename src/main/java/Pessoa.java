public abstract class Pessoa {
    private int id;
    protected String nome;
    private float valorCompra;
    private float desconto=1;

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


    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float calcularDesconto(){

        float v = this.valorCompra * this.desconto;
        return v;
    }


    public abstract String documentacao();

    public abstract String getTipo();

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
