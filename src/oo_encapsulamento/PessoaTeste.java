package oo_encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Henrique","Pacheco",48);
        //p1.idade = -30; não pode acessar atributo private
        System.out.println(p1.getNomeCompleto());
        System.out.println(p1.getIdade());
        System.out.println(p1); //Chama o overhide toString 
    }
}
