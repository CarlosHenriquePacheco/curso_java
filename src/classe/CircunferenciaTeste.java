package classe;

public class CircunferenciaTeste {
    public static void main(String[] args) {
        Circunferencia circ1 = new Circunferencia(8.5);    
        System.out.println("Área: "+circ1.area());
        System.out.println("PI da classe Math: "+Math.PI);
        System.out.println("Área chamando o método estático"+Circunferencia.area(8.5));
    }
    
}
