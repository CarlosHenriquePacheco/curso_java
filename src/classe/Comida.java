package classe;

public class Comida {
    private String nome;
    private double peso;
    //Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    //Construtor
    Comida(String pNome,double pPeso){
        this.nome = pNome;
        this.peso = pPeso;
    }
}
