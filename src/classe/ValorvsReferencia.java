package classe;

public class ValorvsReferencia {

    public static void main(String[] args) {
        double a = 2;
        double b = a; //Atribuição por valor
        a++;
        b--;
        System.out.println("a igual a : "+a);
        System.out.println("b igual a : "+b);
        Data d1 = new Data(1,10,2000);
        Data d2 = d1; //Atribuição por referência

        d1.setDia(31);
        d2.setMes(12);

        System.out.println("Dia 1: "+d1.obterDataFormatada());
        System.out.println("Dia 2: "+d2.obterDataFormatada());
        
    }
   
}
