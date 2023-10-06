package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        //Diferença de comportamento entre add e offer ocorre quando a fila está cheia
        //add() lançará uma exceção caso a fila esteja cheia.
        //.offer() retorna falso caso a fila esteja cheia.

        //Adicionar elemento na fila
        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Carlos");
        fila.offer("Rafaela");
        fila.add("Gui");
        //Diferença de comportamento entre peek e element  ocorre quando a fila está vazia
        //O peek retorna null quando a fila está vazia
        //O element dá Erro de "No such Element Exception" quando a lista está vazia

        //Obter o próximo elemento da fila
        System.out.println(fila.peek());
        System.out.println(fila.peek());
        System.out.println(fila.element());

        //Tamanho da fila    
        System.out.println(fila.size());
        //Retorna um, boolean , se a lista estiver vazia true
        System.out.println(fila.isEmpty());

        //Diferença de comportamento entre peek e element  ocorre quando a fila está vazia
        //poll retorna null se a fila estiver vazia
        //remove dá Erro de "No such Element Exception" quando a lista está vazia

        //Eliminar o elemento que está na frente na fila
        System.out.println(fila.poll());
        System.out.println(fila.remove());

        System.out.println(fila.size());

        System.out.println(fila.contains("Carlos"));
    }    
}
