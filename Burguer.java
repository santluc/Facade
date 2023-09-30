public class Burguer extends Produto {

    private double preco;

    public Burguer() {
        this.descricao = "X-Bacon";
        this.preco = 25.00;
    }

    @Override
    public double calcularPrecoFinal() {
        return this.preco;
    }
}
