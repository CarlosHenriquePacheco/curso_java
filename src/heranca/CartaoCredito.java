package heranca;

public class CartaoCredito {
    private double limite;

    public CartaoCredito(double pLimite){
            this.limite = pLimite;
    }

    //Implementar get and set 
    public double getLimite(){
        return this.limite;
    }
    public void setLimite(double pLimite){
        this.limite = pLimite;
    }
}

