public class Sobremesa extends Produto {

    private double preco;

    public Sobremesa() {
        this.descricao = "Torta de chocolate";
        this.preco = 15.00;
    }

    @Override
    public double calcularPrecoFinal() {
        return this.preco;
    }
}
