package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        //Diferen�a de comportamento entre add e offer ocorre quando a fila est� cheia
        //add() lan�ar� uma exce��o caso a fila esteja cheia.
        //.offer() retorna falso caso a fila esteja cheia.

        //Adicionar elemento na fila
        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Carlos");
        fila.offer("Rafaela");
        fila.add("Gui");
        //Diferen�a de comportamento entre peek e element  ocorre quando a fila est� vazia
        //O peek retorna null quando a fila est� vazia
        //O element d� Erro de "No such Element Exception" quando a lista est� vazia

        //Obter o pr�ximo elemento da fila
        System.out.println(fila.peek());
        System.out.println(fila.peek());
        System.out.println(fila.element());

        //Tamanho da fila    
        System.out.println(fila.size());
        //Retorna um, boolean , se a lista estiver vazia true
        System.out.println(fila.isEmpty());

        //Diferen�a de comportamento entre peek e element  ocorre quando a fila est� vazia
        //poll retorna null se a fila estiver vazia
        //remove d� Erro de "No such Element Exception" quando a lista est� vazia

        //Eliminar o elemento que est� na frente na fila
        System.out.println(fila.poll());
        System.out.println(fila.remove());

        System.out.println(fila.size());

        System.out.println(fila.contains("Carlos"));
    }    
}
