package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {
        UnaryOperator<Integer> maisDois = n -> n+2;
        UnaryOperator<Integer> vezesDois = n -> n*2;
        UnaryOperator<Integer> aoQuadrado = n -> n*n;
        //andThen executa do in�cio para o final
        int resultado = maisDois
            .andThen(vezesDois)
            .andThen(aoQuadrado)
            .apply(0);
        System.out.println(resultado);
        //Compose executa do final para o in�cio
        int resultado2 = maisDois
            .compose(vezesDois)
            .compose(aoQuadrado)
            .apply(0);
        System.out.println(resultado2);
    }
}
