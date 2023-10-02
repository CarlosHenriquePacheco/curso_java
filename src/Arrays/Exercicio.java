package Arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[4];
        System.out.println(Arrays.toString(notasAlunoA));
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8.0;
        notasAlunoA[2] = 8.7;
        notasAlunoA[3] = 9.7;
        System.out.println(Arrays.toString(notasAlunoA));
        double total = 0.00;
        for (int i=0;i<notasAlunoA.length;i++){
            total = total+notasAlunoA[i];
        }
        double media = total/notasAlunoA.length;
        System.out.printf("Media : %.2f",media);

        total = 0;
        double[] notasAlunoB = {5.5,6.8,9.1,7.5};
        for (int i = 0; i < notasAlunoB.length; i++) {
            total = total+notasAlunoB[i];
        }
        System.out.println();
        media = total/notasAlunoB.length;
        System.out.printf("Media : %.2f",media);
    }
    
}
