package oo_heranca.Desafio;

public class Carro {
    private double velocidadeAtual;
    private final double VELOCIDADEMAXIMA;

    //Construtor
    public Carro(double pVelocidadeMaxima){
        this.VELOCIDADEMAXIMA = pVelocidadeMaxima;
    }

    //Getters and Setters
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
                velocidadeAtual = velocidadeAtual +5;
                if (velocidadeAtual>VELOCIDADEMAXIMA) {
                    velocidadeAtual = VELOCIDADEMAXIMA;
                }
            }else{
                velocidadeAtual = VELOCIDADEMAXIMA;
            }
        }
        

    public void frear(){
        velocidadeAtual = velocidadeAtual -5;
        if (velocidadeAtual<0) {
            velocidadeAtual = 0;
        }
    }
    public void mostrarVelocidadeAtual(){
        System.out.println("Velocidade atual: -> "+velocidadeAtual+ "km/h");
    }

}
