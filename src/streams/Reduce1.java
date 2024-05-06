package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Reduce1 {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        BinaryOperator<Integer> soma = (ac, n) -> ac + n;

        int vTotal1 = nums.stream().reduce(soma).get();
        System.out.println(vTotal1);

        Integer vTotal2 = nums.stream().reduce(100,soma);
        System.out.println(vTotal2);

        //Resultado foi um Opcional <Integer>...
        nums.stream()
        .filter(n -> n>9)
        .reduce(soma)
        .ifPresent(System.out::println);
    }

}
