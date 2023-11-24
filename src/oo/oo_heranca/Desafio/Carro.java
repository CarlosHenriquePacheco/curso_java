package oo.oo_heranca.Desafio;

public class Carro {
    private double velocidadeAtual;
    private final double VELOCIDADEMAXIMA;
    private int delta = 5;

    //Construtor
    public Carro(){
        this(160);
    }
    public Carro(double pVelocidadeMaxima){
        this.VELOCIDADEMAXIMA = pVelocidadeMaxima;
        delta = 9;
    }

    //Getters and Setters
    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
    public double getVelocidadeMaxima() {
        return VELOCIDADEMAXIMA;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidade_atual) {
        this.velocidadeAtual = velocidade_atual;
    }

    public void acelerar(){
        if (velocidadeAtual<VELOCIDADEMAXIMA) {
                velocidadeAtual = velocidadeAtual +getDelta();
                if (velocidadeAtual>VELOCIDADEMAXIMA) {
                    velocidadeAtual = VELOCIDADEMAXIMA;
                }
            }else{
                velocidadeAtual = VELOCIDADEMAXIMA;
            }
        }
        

    public void frear(){
        velocidadeAtual = velocidadeAtual -getDelta();
        if (velocidadeAtual<0) {
            velocidadeAtual = 0;
        }
    }
    public void mostrarVelocidadeAtual(){
        System.out.println("Velocidade atual: -> "+velocidadeAtual+ "km/h");
    }

}
