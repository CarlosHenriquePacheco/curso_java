package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class imprimindoObjetos {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Lu","Gui","Ana");
        //Usando Foreach
        System.out.println("\nUsando Foreach...");
        for (String nome : aprovados) {
            System.out.println(nome);            
        }
        //Usando Iterator
        System.out.println("\nUsando Iterator...");
        Iterator<String> iterator = aprovados.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Usando Stream
         //Usando Iterator
         System.out.println("\nUsando Stream...");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);   //La�o interno!!!
    }
}
