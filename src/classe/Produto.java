package classe;

public class Produto {
    private String nome;
    private double preco;
    private static double desconto = 0.25;
    //Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getDesconto() {
        return desconto;
    }
    public void setDesconto(double desconto) {
        Produto.desconto = desconto;
    }
    //Construtores
    Produto(){

    }
    Produto(String pNomeInicial,double pPrecoInicial){
        nome = pNomeInicial;
        preco = pPrecoInicial;
    }
    //Métodos
    double precoComDesconto(){
        return preco * (1-desconto);
    }
    double precoComDesconto(double pDescontodoGerente){
        return preco * (1-desconto+pDescontodoGerente);
    }
}
