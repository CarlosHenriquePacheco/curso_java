package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {

    private Utilitarios() {
        // Construtor privado porque não quero que a classe seja instanciada
    }

    public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
    public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";

    public final static String grito(String n) {
        return n + "!!!";
    }

    public final static String decimalString(Integer i) {
        return i.toBinaryString(i);
    }

    public final static Integer stringDecimal(String s) {
        return Integer.parseInt(s,2);
    }

    public final static String inverterString(String s) {
        return  new StringBuilder(s).reverse().toString();
    }

}
