package oo_heranca.Desafio;

public class Ferrari extends Carro{
    //Construtor
    public Ferrari(double pVelocidadeMaxima){
        super(pVelocidadeMaxima);
    }
    @Override
    public void acelerar(){
        super.acelerar();
        super.acelerar();
        super.acelerar();
    }
    @Override
    public void frear(){
        super.frear();
        super.frear();
    }
}