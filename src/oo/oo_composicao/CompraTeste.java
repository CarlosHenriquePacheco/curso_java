package oo.oo_composicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.setCliente("Carlos Henrique");
        compra1.itens.add(new ItemCompra("Caneta", 20, 2));
        compra1.itens.add(new ItemCompra("Borracha", 12, 4));
        compra1.itens.add(new ItemCompra("Caderno", 3, 50));
        System.out.println(compra1.itens.size());
        System.out.println("O valor total da Compra =:R$"+compra1.obterValorTotal());
    }
}
