package oo_composicao.desafio;

public class Produto {
    private String nome;
    private double preco;
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
    //Construtor de Produto
    Produto(String pNome,double pPreco){
        this.nome = pNome;
        this.preco = pPreco;
    }
}
