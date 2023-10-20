package oo_composicao.desafio;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private ArrayList<CompraItens> listaCompras;
    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<CompraItens> getListaCompras() {
        return listaCompras;
    }
    //Construtor
    public Cliente(String pNomeCliente){
        this.nome = pNomeCliente;
    }
   

    public void setListaCompras(ArrayList<CompraItens> listaCompras) {
        this.listaCompras = listaCompras;
    }

    //Método para obter valor total gasto pelo cliente
    public double obterValorTotalCliente(Cliente pCliente){
        double vValorTotalCli = 0;
        for (CompraItens compraItem : listaCompras) {
            vValorTotalCli = vValorTotalCli + (compraItem.obterValorTotalCompra(compraItem.getListaItens()));
        }
        return vValorTotalCli;
    }
}
