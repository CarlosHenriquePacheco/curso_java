package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;

        Stream<String> langs = Stream.of("Java ","Delphi ","JS\n");
        langs.forEach(print);

        String[] maislangs = {"Pyton ","Lisp ","Perl ","Go\n"};
        Stream.of(maislangs).forEach(print);

        Arrays.stream(maislangs).forEach(print);
        Arrays.stream(maislangs,0,3).forEach(print);
        System.out.println(" ");
        
        List<String> outraslangs = Arrays.asList("C ","PHP ","Kotlin");
        outraslangs.stream().forEach(print);
        System.out.println(" ");
        outraslangs.parallelStream().forEach(print);
    }
}
