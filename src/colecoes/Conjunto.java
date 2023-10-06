package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Conjunto {
    public static void main(String[] args) {
        //Set<String> lista = new HashSet<String>();
        Set<String> lista = new TreeSet<String>();
        lista.add("Ana");
        lista.add("Pedro");
        lista.add("Paulo");
        lista.add("Carlos");

        for (String candidato : lista) {
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(18);
        nums.add(90);
        nums.add(1);
        nums.add(120);

        for (int vNums : nums) {
            System.out.println(vNums);
        }

    }
}
