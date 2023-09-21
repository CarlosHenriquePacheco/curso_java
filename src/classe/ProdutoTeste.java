package classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto();

        p1.setNome("Iphone 14");    
        p1.setPreco(5000);
        System.out.println("Preço Final "+p1.getNome()+": "+p1.precoComDesconto());

        Produto p2 = new Produto("Tablet Samsung" , 1000);
        System.out.println("Preço Final "+p2.getNome()+": "+p2.precoComDesconto());
    }
    

}
