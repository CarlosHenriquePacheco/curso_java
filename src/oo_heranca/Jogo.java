package oo_heranca;

import enums.Direcao;

public class Jogo {
    public static void main(String[] args) {
        Heroi j1 = new Heroi();
        Monstro j2 = new Monstro();

        j1.x = 10;
        j1.y = 10;

        j2.x = 10;
        j2.y = 11;


        System.out.println(j1.vida);
        System.out.println(j2.vida);

        j1.atacar(j2);
        j2.atacar(j1);

        System.out.println(j1.vida);
        System.out.println(j2.vida);
        j1.andar(Direcao.NORTE);
        j2.atacar(j1);
        System.out.println(j1.vida);
        System.out.println(j2.vida);
    }
}
