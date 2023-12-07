package lambdas;

public class CalculoTesteLambda {
    public static void main(String[] args) {
        Calculo calculo = (x,y) -> {return x + y;};
        System.out.println(calculo.executar(2, 5));
        calculo = (x,y) -> x*y;
        System.out.println(calculo.executar(2, 5));
    }
}
