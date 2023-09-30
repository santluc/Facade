public class Burguer {

    private String descricao;
    private double preco;

    public Burguer() {
        this.descricao = "X-Bacon";
        this.preco = 25.00;
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

