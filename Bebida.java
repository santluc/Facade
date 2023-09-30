    public class Bebida extends Produto {

        private double preco;

        public Bebida() {
            this.descricao = "Refrigerante";
            this.preco = 5.00;
        }
    
        @Override
        public double calcularPrecoFinal() {
            return this.preco;
        }
    }
    

