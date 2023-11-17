package oo_polimorfismo;

public class Comida {
    private double peso;

    //Construtor
    public Comida(double pPeso){
        setPeso(pPeso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso>=0) {
            this.peso = peso;    
        }
    }
}
