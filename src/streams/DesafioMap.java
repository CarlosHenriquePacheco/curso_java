package streams;

import java.util.Arrays;
import java.util.List;

public class DesafioMap {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        //nums.stream().forEach(System.out::println);

     //System.out.println(Utilitarios.decimalString(2));

     //Implementação da Lógica do Desafio
     nums.stream()
        .map(Utilitarios::decimalString)
        .map(Utilitarios::inverterString)
        .map(Utilitarios::stringDecimal)
        .forEach(System.out::println);
    }
}
