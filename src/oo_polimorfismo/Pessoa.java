package oo_polimorfismo;

public class Pessoa {
    private double peso;
    //Construtor
    public Pessoa(double pPeso){
        setPeso(pPeso);
    }
    //Getters and Setters
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso>=0) {
            this.peso = peso;    
        }
    }
    public void comer(Comida pComida){
        this.peso += pComida.getPeso();
    }
}
