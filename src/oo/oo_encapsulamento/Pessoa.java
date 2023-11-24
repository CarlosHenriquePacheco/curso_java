package oo.oo_encapsulamento;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    //Construtor
    public Pessoa(String nome,String sobrenome,int idade) {
        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);
    }
    //Getters and Setters
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int pIdade) {
        pIdade = Math.abs(pIdade);
        if (pIdade>=0 && pIdade <=120) {
            this.idade = pIdade;    
        }
    }
    public String getNomeCompleto(){
        return getNome() + " "+ getSobrenome();
    }

    @Override
    public String toString(){
        return "Ola, eu sou o "+getNome()+ " "+getSobrenome()+ " e tenho "+getIdade()+" anos!";
    }
}
