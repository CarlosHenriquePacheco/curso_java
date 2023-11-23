package oo_heranca.Desafio;

public class TestaCarros {
    public static void main(String[] args) {
        Carro c1 = new Carro(160);
        Corolla c2 = new Corolla(180);
        Ferrari f1 = new Ferrari(350);
        

        //Velocidade Inicial
        c1.mostrarVelocidadeAtual();
        c2.mostrarVelocidadeAtual();
        f1.mostrarVelocidadeAtual();
        //f1.ligarTurbo();

        //Acelerar cada carro 3 vezes
        for (int i = 0; i < 5; i++) {
            c1.acelerar();
            c2.acelerar();
            f1.acelerar();
        }
        f1.desligarTurbo();
        for (int i = 0; i < 3; i++) {
            c1.frear();
            c2.frear();
            f1.frear();
        }
        //Velocidade Atual
        c1.mostrarVelocidadeAtual();
        c2.mostrarVelocidadeAtual();
        f1.mostrarVelocidadeAtual();


    }
}
