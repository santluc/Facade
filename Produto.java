public abstract class Produto {
    
        protected String descricao;
        private double preco;
    
        public Produto() {
            this.descricao = "";
            this.preco = 0.0;
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
            return "Descrição: " + this.descricao + ", Preço: " + this.preco;
        }
    
        public abstract double calcularPrecoFinal();
    }
    
