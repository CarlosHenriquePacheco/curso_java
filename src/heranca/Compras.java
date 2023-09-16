package heranca;

public class Compras implements Comparable<Compras>{
    private String desCompra;
    private double precoCompra;


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
        return this.getDesCompra().compareTo(pCompra.getDesCompra());
    }

   
}
