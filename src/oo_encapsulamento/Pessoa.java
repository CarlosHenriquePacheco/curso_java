package oo_encapsulamento;

public class Pessoa {
    private int idade;
    //Construtor
    public Pessoa(int idade) {
        this.idade = idade;
    }
    //Getters and Setters
    public int getIdade() {
        return idade;
    }

    public void setIdade(int pIdade) {
        if (pIdade>=0) {
            this.idade = pIdade;    
        }
    }
}
