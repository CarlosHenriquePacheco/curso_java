package heranca;

public class Compras implements Comparable<Compras>{
    private String desCompra;
    private double precoCompra;

     public Compras(String pDesCompra,double pPrecoCompra){
        this.desCompra = pDesCompra;
        this.precoCompra = pPrecoCompra;
     }

    //Implementar Getters and Setters
    public String getDesCompra(){
        return this.desCompra;
    }
    public double getPrecoCompra(){
        return this.precoCompra;
    }
    public void setDesCompra(String pDesCompra){
        this.desCompra = pDesCompra;
    }
    public void setPrecoCompra(double pPrecoCommpra){
        this.precoCompra = pPrecoCommpra;
    }

    @Override
    public int compareTo(Compras pCompra) {
        return Double.valueOf(this.precoCompra).compareTo(Double.valueOf(pCompra.precoCompra));
    }

    @Override
    public String toString() {
        return "Produto: "+this.desCompra + "Preco: " + this.precoCompra;
    } 
   
}
