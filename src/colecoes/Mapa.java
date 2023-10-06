package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer,String> usuarios = new HashMap<>();
        //Insert
        usuarios.put(1,"Carlos");
        //Update
        usuarios.put(1, "Carlos Henrique");
        usuarios.put(2, "Thiago");
        usuarios.put(3, "João Henrique");
        usuarios.put(4, "Thais");

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(1));
        System.out.println(usuarios.containsKey(5));

        //Retorna true se existir o valor e false se não existir
        System.out.println(usuarios.containsValue("Carlos Henrique"));
        System.out.println(usuarios.containsValue("Alexsandra"));

        //Traz o valor quando se passa a chave
        System.out.println(usuarios.get(1));
        //Retorna null quando não existe
        System.out.println(usuarios.get(10));

        //foreach para percorrer o mapa pela chave
        for (int chave : usuarios.keySet()) {
            System.out.println(chave);
        }

        for (String valor : usuarios.values()) {
            System.out.println(valor);
        }

        for (Entry<Integer,String> registro: usuarios.entrySet()) {
            System.out.println(registro.getKey()+ "==> "+ registro.getValue());
        }


    }    
}
