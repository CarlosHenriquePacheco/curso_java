package lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer,String> parOuImpar = 
               numero -> numero % 2 == 0 ? "Par" : "Ímpar";
        /* System.out.println(parOuImpar.apply(323));*/

        Function<String,String> oResultadoe = 
            valor -> "O resultado e:" + valor;

        Function<String,String> empolgado = 
            valor -> valor + "!!!";
        
        Function<String,String> comDuvida = 
            valor -> valor + "???";
        
        String resultadoFinal1 = parOuImpar.
                andThen(oResultadoe)
                .andThen(empolgado)
                .apply(32);
        System.out.println(resultadoFinal1);

        String resultadoFinal2 = parOuImpar.
                andThen(oResultadoe)
                .andThen(comDuvida)
                .apply(32);
        System.out.println(resultadoFinal2);

    }
}
