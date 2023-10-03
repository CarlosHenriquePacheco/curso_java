package arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;


public class DesafioArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos:");
        int vQtdAlunos = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite a quantidade de notas");
        int vQtdNotas = Integer.parseInt(entrada.nextLine());

        double[][] vNotas = new double[vQtdAlunos][vQtdNotas];

        for (int i = 0; i < vQtdAlunos; i++) {
            for (int j = 0; j < vQtdNotas; j++) {
                System.out.println("Digite a nota "+ (j+1) +" do aluno "+ (i+1)+":");
                vNotas[i][j] = Double.parseDouble(entrada.nextLine());    
            }
        }
        double vtotalGeral = 0.0;
        double vMediaGeral = 0.0;
        double total = 0.0;
        double media = 0.0;
        for (int i = 0; i < vQtdAlunos; i++) {
            for (double nota : vNotas[i]) {
            total = total + nota;
            }    
            media = total/vQtdNotas;    
            System.out.println("Array:"+Arrays.toString(vNotas[i]));
            System.out.printf("Media : %.2f",media);
            System.out.println();
            vtotalGeral = vtotalGeral + total;
            total = 0.0;
            media = 0.0;
        }
        vMediaGeral = vtotalGeral/(vQtdAlunos*vQtdNotas);
        System.out.printf("Media Geral da Turma: %.2f",vMediaGeral);
        entrada.close();
        
    }
}
