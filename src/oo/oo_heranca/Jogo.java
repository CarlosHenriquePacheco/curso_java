package oo.oo_heranca;

import enums.Direcao;

public class Jogo {
    public static void main(String[] args) {
        Heroi heroi1 = new Heroi();
        Monstro monstro1 = new Monstro();

        heroi1.x = 10;
        heroi1.y = 10;

        monstro1.x = 10;
        monstro1.y = 11;


        System.out.println("Heroi tem->"+ heroi1.vida);
        System.out.println("Monstro tem ->"+ monstro1.vida);
        heroi1.atacar(monstro1);
        monstro1.atacar(heroi1);
        heroi1.atacar(monstro1);

        System.out.println("Heroi tem->"+ heroi1.vida);
        System.out.println("Monstro tem ->" + monstro1.vida);
        heroi1.andar(Direcao.NORTE);
        monstro1.atacar(heroi1);
        System.out.println("Heroi tem->"+ heroi1.vida);
        System.out.println("Monstro tem ->"+  monstro1.vida);
    }
}
