package oo_composicao;

public class ItemCompra {
    private String nome;
    private int quantidade;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    ItemCompra(String pnome,int pQuantidade,double pPreco){
        this.nome = pnome;
        this.quantidade = pQuantidade;
        this.preco = pPreco;
    }
}
