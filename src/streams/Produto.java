package streams;

public class Produto {
    private double preco;
    private String nome;
    private double desconto;
    private double freteGratis;

    

    public Produto(double preco, String nome, double desconto, double freteGratis) {
        this.preco = preco;
        this.nome = nome;
        this.desconto = desconto;
        this.freteGratis = freteGratis;
    }



    public double getPreco() {
        return preco;
    }



    public void setPreco(double preco) {
        this.preco = preco;
    }



    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public double getDesconto() {
        return desconto;
    }



    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }



    public double getFreteGratis() {
        return freteGratis;
    }



    public void setFreteGratis(double freteGratis) {
        this.freteGratis = freteGratis;
    }

    

}
