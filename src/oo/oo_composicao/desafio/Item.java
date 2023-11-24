package oo.oo_composicao.desafio;

public class Item {
    private int qtd;
    private Produto produto;

    //Getters and Setters
    public int getQtd() {
        return qtd;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public double obterPrecoProduto(Produto pProduto){
        return pProduto.getPreco();
    }

    

}
