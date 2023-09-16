package heranca;

import java.util.List;

public class CartaoCredito {
    private double limite;
    private double saldo;
    private List<Compras> vcompra;

    public CartaoCredito(double pLimite){
            this.limite = pLimite;
    }  

    //Implementar getters and setters
    public double getLimite(){
        return this.limite;
    }
     public double getSaldo(){
        return this.saldo;
    }
    public void setLimite(double pLimite){
        this.limite = pLimite;
    }
    public List<Compras> getCompras() {
        return vcompra;
    }

    public boolean lanca_compra(Compras compra){
        if (this.saldo>=compra.getPrecoCompra()){
            this.saldo = this.saldo - compra.getPrecoCompra();
            this.vcompra.add(compra);
            return true;
        }
        return false;
    }

}

