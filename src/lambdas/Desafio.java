package lambdas;

import java.util.function.Function;

public class Desafio {
    public static void main(String[] args) {
        Produto p = new Produto("iPad", 3235.89, 0.13);

        Function<Produto, Double> precoComDesconto = prod -> prod.preco - (prod.preco * prod.desconto);
        Function<Double, Double> precoComImposto = precoImp -> precoImp >= 2500 ? (precoImp + 8.5 / 100 * precoImp)
                : precoImp;
        Function<Double, Double> precoComFrete = precoFrete -> precoFrete >= 3000 ? precoFrete + 100 : precoFrete + 50;

        Double precoRealFinal = precoComDesconto
                               .andThen(precoComImposto.
                               andThen(precoComFrete)).apply(p);
        System.out.printf("R$%,.2f",precoRealFinal);
    }
}
/*
 * A partir od Produto calcular o preço real com desconto
 * Imposto Municipal >=2500 (8,5%) / <2500 (Isento)
 * Frete >=3000 (100) / <3000 (50)  
 * Arredondar -> deixar 2 casas decimais
 * Formatar R$1234,56
 */