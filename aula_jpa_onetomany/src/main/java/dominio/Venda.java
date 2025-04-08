package dominio;

import java.util.logging.LogManager;

public class Venda{
    private Long Id;
    private double valorTotal;
    private List<Produto> produtos;
    //Cliente

    public Venda(){
        thisI(0);
    }

    public Venda(double valorTotal){
        this.valorTotal = valorTotal;
    }

    public void setProdutos(List<Produto> produtos){
        this.produtos = produtos;
    }

    public List<Produto> getProdutos(){
        return this.produtos;
    }

    @Override
        public String toString(){
            return "Venda[Id=" + Id + ", Valor Total=" + valorTotal + "]";
        }
}