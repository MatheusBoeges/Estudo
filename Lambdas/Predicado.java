package Lambdas;

import java.util.function.Predicate;

public class Predicado {
	
	public static void main(String[] args) {
		
		// Predicate é uma interface funcional introduzida no Java 8 que representa uma função que recebe um argumento e retorna um valor booleano (true ou false).
		
		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;
		
		Produto produto = new Produto("Notebook", 3893.89, 0.15);
		
		// A interface Predicate tem um único método abstrato chamado test(), que aceita um argumento do tipo genérico T e retorna um valor booleano indicando se a condição é satisfeita para o argumento.
		
		System.out.println(isCaro.test(produto));	
	
		/* 
		 * Predicate é frequentemente usado em contextos onde é necessário testar elementos de uma coleção com base em alguma condição específica.
		 * Por exemplo, ao filtrar uma lista de números para encontrar apenas os números pares, ou ao verificar se uma string satisfaz determinados critérios.
		 * 
		 */
		
	}

}
