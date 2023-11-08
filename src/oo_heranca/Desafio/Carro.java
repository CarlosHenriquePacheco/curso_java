package oo_heranca.Desafio;

public class Carro {
    private double velocidadeAtual;
    private double velocidadeMaxima;

    //Construtor
    public Carro(double pVelocidadeMaxima){
        this.velocidadeMaxima = pVelocidadeMaxima;
    }

    //Getters and Setters
    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidade_maxima) {
        this.velocidadeMaxima = velocidade_maxima;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidade_atual) {
        this.velocidadeAtual = velocidade_atual;
    }

    public void acelerar(){
        if (velocidadeAtual<velocidadeMaxima) {
                velocidadeAtual = velocidadeAtual +5;
            }else{
                velocidadeAtual = velocidadeMaxima;
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
