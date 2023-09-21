package classe;

public class Circunferencia {
    private double raio;
    private static final double PI = 3.14;

    //Getters and Stters
    public double getRaio() {
        return raio;
    }
    public void setRaio(double praio) {
        this.raio = praio;
    }
    public static final double getPi() {
        return PI;
    }
    //Fim Getters and Setters
    
    Circunferencia(double pRaioInicial){
        raio = pRaioInicial;
    }

    double area(){
        return Math.pow(raio, 2) * PI;
    }
    static double area(double pRaio){
        //Pow é método Estático da classe Math
        return Math.pow(pRaio, 2) * Math.PI;
    }

    
}
