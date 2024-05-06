package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {
        
        Produto p1 = new Produto(3000, "Notebook Dell", 10, 100);
        Produto p2 = new Produto(5000, "Notebook HP", 30, 0);
        Produto p3 = new Produto(200, "Teclado", 40, 0);
        Produto p4 = new Produto(1500, "Cadeira", 30, 80);
        Produto p5 = new Produto(5000, "Mesa", 40, 50);
        Produto p6 = new Produto(80, "Mouse", 10, 0);
        Produto p7 = new Produto(800, "HD Externo", 35, 0);
        Produto p8 = new Produto(1000, "Monitor", 25, 0);

        List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8);

        Predicate<Produto> descontoBom = p -> p.getDesconto()>=30;
        Predicate<Produto> freteGratis = p -> p.getFreteGratis() == 0;
        Predicate<Produto> produtoRelevante = p -> p.getPreco() >=500;
        Function<Produto,String> mensagemProdutos = 
        p -> "Aproveite o produto " + p.getNome() + " por R$" + p.getPreco() ;
        
        produtos.stream()
            .filter(descontoBom)
            .filter(freteGratis)
            .filter(produtoRelevante)
            .map(mensagemProdutos)
            .forEach(System.out::println);
    }

}
