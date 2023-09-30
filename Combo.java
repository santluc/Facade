public class Combo {

    private Burguer burger;
    private Sobremesa sobremesa;
    private Bebida bebida;

    public Combo() {
        this.burger = new Burguer();
        this.sobremesa = new Sobremesa();
        this.bebida = new Bebida();
    }

    public void CriarCombo(int tipo) {
        switch (tipo) {
            case 1:
                this.burger.setDescricao("X-Bacon");
                this.burger.setPreco(25.00);
                this.sobremesa.setDescricao("Torta de chocolate");
                this.sobremesa.setPreco(15.00);
                this.bebida.setDescricao("Refrigerante");
                this.bebida.setPreco(5.00);
                break;
            case 2:
                this.burger.setDescricao("Hamburguer");
                this.burger.setPreco(20.00);
                this.sobremesa.setDescricao("Sorvete");
                this.sobremesa.setPreco(10.00);
                this.bebida.setDescricao("Água");
                this.bebida.setPreco(3.00);
                break;
            default:
                System.out.println("Tipo de combo inválido");
                break;
        }
    }

    public String toString() {
        return "Combo: " + this.burger.getDescricao() + ", " + this.sobremesa.getDescricao() + ", " + this.bebida.getDescricao();
    }
}
