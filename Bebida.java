public class Bebida {

    private String descricao;
    private double preco;

    public Bebida() {
        this.descricao = "Refrigerante";
        this.preco = 5.00;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return this.preco;
    }

    @Override
    public String toString() {
        return this.descricao;
    }
}
