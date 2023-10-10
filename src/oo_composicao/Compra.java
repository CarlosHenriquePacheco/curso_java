package oo_composicao;

import java.util.ArrayList;

public class Compra {
    private String cliente;
    ArrayList<ItemCompra> itens = new ArrayList<ItemCompra>();
    
    //Get and Set Cliente
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double obterValorTotal(){
        double total = 0;
        for (ItemCompra itemCompra : itens) {
            total = total + (itemCompra.getPreco()*itemCompra.getQuantidade());
        }
        return total;
    }
    
}
