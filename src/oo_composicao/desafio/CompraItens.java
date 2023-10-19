package oo_composicao.desafio;

import java.util.ArrayList;

public class CompraItens {
    
    private ArrayList<Item> listaItens;
    //Getters and Setters
    public ArrayList<Item> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<Item> listaItens) {
        this.listaItens = listaItens;
    }

    //Método para adicionar Item
    public void adicionarItem(Produto pProd,int pQuantidade){
        this.listaItens.add(new Item(pQuantidade, pProd));
    }
    //Método para Obter Valor Total de determinada compra
    public double obterValorTotalCompra(ArrayList<Item> plistaItens){
        double vValorTotal = 0;
        for (Item item : plistaItens) {
           vValorTotal = vValorTotal + (item.getQtd()*item.obterPrecoProduto(item.getProduto()));
        }
        return vValorTotal;
    }
}
