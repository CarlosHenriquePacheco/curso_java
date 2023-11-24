package oo.oo_heranca.Desafio;

public class Corolla extends Carro{
    //Construtor
    public Corolla(){
        this(170);
    }
    public Corolla (double pVelocidadeMaxima){
        super(pVelocidadeMaxima);
        setDelta(7);
    }
    
}
