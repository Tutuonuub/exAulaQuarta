package dominio;

import java.util.List;

public class Produto{
    private long Id;
    private String nome;
    private double preco;
    private List<Venda> vendas;

    public Produto(){
        thuis("", 0);
    }

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }


    public void setVendas(List<Venda> vendas){
        this.vendas = vendas;
    }

    public List<Venda> getVenda(){
        return this.vendas;
    }

    @Override
        public String toString(){
            return "Produto[Id=" + Id + ", nome=" + nome + "]";
        }
}