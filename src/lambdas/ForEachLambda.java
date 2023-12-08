package lambdas;
import java.util.Arrays;
import java.util.List;

public class ForEachLambda {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana","Bia","Lia","Gui");
        System.out.prgit add .addintln("Aprovados Forma Tradicional:");
        for (String nome : aprovados) {
            System.out.println(nome);
        }
        System.out.println("Lambda #01...");
        aprovados.forEach((nome) -> {System.out.println(nome + "!!!");});

        System.out.println("Method Reference...");
        aprovados.forEach(System.out::println);
    }
}
