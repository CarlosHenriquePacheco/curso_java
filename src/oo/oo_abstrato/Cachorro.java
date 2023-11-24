package oo.oo_abstrato;

public class Cachorro extends Mamifero{

    @Override
    public String mamar() {
        return "Usando Leite";
    }

    @Override
    public String mover() {
        return "Usando as Patas";
    }
}
