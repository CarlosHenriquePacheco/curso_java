package classe;

public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Carlos Henrique", 62);
        Comida c1 = new Comida("Arroz", 0.20);
        Comida c2 = new Comida("Feijao", 0.25);
        Comida c3 = new Comida("Carne", 0.3);
        System.out.println("Peso de "+p1.getNome()+ " antes de comer: "+p1.getPeso());
        p1.Comer(c1);
        p1.Comer(c2);
        p1.Comer(c3);
        System.out.println("Peso de "+p1.getNome()+ " depois de jantar: "+p1.getPeso());
    }    
}
