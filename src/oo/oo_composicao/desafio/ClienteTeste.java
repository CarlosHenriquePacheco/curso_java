package oo.oo_composicao.desafio;

import java.util.ArrayList;

public class ClienteTeste {
    public static void main(String[] args) {
        //Produtos
        Produto p1 = new Produto("Caneta", 3);
        Produto p2 = new Produto("Régua", 10);
        Produto p3 = new Produto("Camisa", 40);
        Produto p4 = new Produto("Calça", 100);
        Produto p5 = new Produto("Agenda", 50);
        //Itens
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();
        Item item5 = new Item();

        item1.setProduto(p1);
        item1.setQtd(2);
        item2.setProduto(p2);
        item2.setQtd(3);
        item3.setProduto(p3);
        item3.setQtd(4);
        item4.setProduto(p4);
        item4.setQtd(5);
        item5.setProduto(p5);
        item5.setQtd(3);

        //Compra Itens
        CompraItens c1 = new CompraItens();
        CompraItens c2 = new CompraItens();
        
        ArrayList<Item> lista1 = new ArrayList<>();
        lista1.add(item1);
        lista1.add(item2);
        c1.setListaItens(lista1);
        ArrayList<Item> lista2 = new ArrayList<>();
        lista2.add(item3);
        lista2.add(item4);
        lista2.add(item5);
        c2.setListaItens(lista2);

        //Compras
        ArrayList<CompraItens> compras = new ArrayList<>();
        compras.add(c1);
        compras.add(c2);

        //Criação do Cliente
        Cliente cliente = new Cliente("Carlos Henrique");
        cliente.setListaCompras(compras);

        //Mostrar o valor de todas as compras do cliente
        System.out.println(cliente.obterValorTotalCliente(cliente));
    }
}
