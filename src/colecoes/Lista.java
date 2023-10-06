package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();
        Usuario u1 = new Usuario("Carlos");
        lista.add(u1);
        
        lista.add(new Usuario("Paulo"));
        lista.add(new Usuario("Alexandre"));
        lista.add(new Usuario("Alexsandra"));
        lista.add(new Usuario("Thiago"));
        lista.add(new Usuario("Thais"));
        lista.add(new Usuario("Joao Henrique"));
        System.out.println(lista.get(3).getNome());   //Acessar pelo índice
        for (Usuario usuario : lista) {
            System.out.println(usuario.getNome());
        }
        lista.remove(new Usuario("Paulo"));
        for (Usuario usuario : lista) {
            System.out.println(usuario.getNome());
        }
        System.out.println(lista.contains(new Usuario("Paulo")));
        System.out.println(lista.contains(new Usuario("Carlos")));
    }
}
