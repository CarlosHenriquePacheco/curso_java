package classe;

public class Pessoa {
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
    Pessoa(String pNome,double pPeso){
        this.nome = pNome;
        this.peso = pPeso;
    }
    public void Comer(Comida pComida){
        if (pComida != null){
            this.peso = this.peso + pComida.getPeso();
        }
    }
}
