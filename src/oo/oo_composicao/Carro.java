package oo.oo_composicao;

public class Carro {
    Motor motor = new Motor();

    void acelerar(){
        if (motor.getFatorInjecao() <2.7) {
            motor.setFatorInjecao(motor.getFatorInjecao()+0.4);
        } 
    }

    void frear() {
        if (motor.getFatorInjecao() >0.2) {
            motor.setFatorInjecao(motor.getFatorInjecao() - 0.4);
        }
    }

    void ligar() {
        motor.setLigado(true);
    }

    void desligar() {
        motor.setLigado(false);
    }

    boolean estaLigado() {
        return motor.getLigado();
    }
}
