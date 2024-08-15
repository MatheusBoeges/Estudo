package StreamsAPI.Desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Kit 50 Caneta Azul", 30.00, 0.83);
		Produto p2 = new Produto("Kit 50 Caneta Vermelha", 53.55, 0.85);
		Produto p3 = new Produto("Kit 50 Caneta Preta", 57.80, 0.85);
		Produto p4 = new Produto("Kit 40 Borrachas", 50.00, 0.76);
		Produto p5 = new Produto("Kit 04 Apontador com Deposito", 23.90, 0.95);
		Produto p6 = new Produto("Kit Lapiseira", 128.00, 0.10);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		Predicate<Produto> caro = p -> p.preco > 50;
		Predicate<Produto> desconto = p -> p.desconto <= 0.80;
		
		Function<Produto, String> produtosMaisCaros = p -> "Este produto " + p.nome + " é o mais caro.";
		
		produtos.stream()
		        .filter(caro)
		        .filter(desconto)
		        .map(produtosMaisCaros)
		        .forEach(System.out::println);
		
	}

}
