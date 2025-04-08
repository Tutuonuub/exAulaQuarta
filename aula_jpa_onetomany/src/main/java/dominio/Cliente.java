package dominio;

public class Cliente{

    private Long Id;
    private String nome;
    private List<Venda> vendas;

    public Cliente(){
        this("");
    }

    public Cliente(String nome){
        this.nome = nome;
    }

    public void setVendas(List<Venda> vendas){
        this.vendas = vendas;
    }

    public List<Venda> getVenda(){
        return this.vendas;
    }

    @Override
        public String toString(){
            return "Cliente[Id=" + Id + ", nome=" + nome + "]";
        }
}