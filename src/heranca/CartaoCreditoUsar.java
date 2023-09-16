package heranca;

import java.util.Collections;

import javax.swing.JOptionPane;

public class CartaoCreditoUsar {
    public static void main(String[] args) {

        String vStrLimite = JOptionPane.showInputDialog("Digite o limite do seu cartão de crédito:");
        // double vLimite = Double.parseDouble(vStrLimite);
        CartaoCredito cartao = new CartaoCredito(Double.parseDouble(vStrLimite));
        int sair = 1;
        while (sair != 0) {
            String vDesCompra   = JOptionPane.showInputDialog("Digite o nome do produto:");
            String vPrecoCompra = JOptionPane.showInputDialog("Digite o preço do produto:");
            //Criar a compra de acordo com o que o usuario digitou
            Compras compraCartao = new Compras(vDesCompra,Double.parseDouble(vPrecoCompra));
            //Lancar a compra no cartao de credito
            cartao.lanca_compra(compraCartao);
           
        }
        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");
        Collections.sort(cartao.getCompras());
        for (Compras compraCartao : cartao.getCompras()) {
            System.out.println(compraCartao.getDesCompra() + " - " +compraCartao.getPrecoCompra());
        }
        System.out.println("\n***********************");

        System.out.println("\nSaldo do cartão: " +cartao.getSaldo());
    }
}