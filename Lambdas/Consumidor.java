package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	
	public static void main(String[] args) {
		
		// Consumer é uma interface funcional introduzida no Java 8 que representa uma operação que aceita um único argumento e não retorna nenhum resultado. 
		
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);
		
		// A interface Consumer tem um único método abstrato chamado accept(), que aceita um argumento do tipo genérico T e não retorna nada.
		
		Produto p1 = new Produto("Caneta", 12.34, 0.09);
		imprimir.accept(p1);
		
		
		Produto p2 = new Produto("Notebook", 2987.99, 0.25);
		Produto p3 = new Produto("Caderno", 19.90, 0.03);
		Produto p4 = new Produto("Borracha", 7.80, 0.18);
		Produto p5 = new Produto("Lapis", 4.39, 0.19);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		System.out.println("\nLambda...");
		
		produtos.forEach(imprimir);
		
		System.out.println("\nManual...");
		
		produtos.forEach(p -> System.out.println(p.preco));
		
		System.out.println("\nMethod Reference precisando criar o metodo toString na classe Produto...");
		
		produtos.forEach(System.out::println);
		
		/*
		 * Consumer é frequentemente usado em contextos onde é necessário aplicar uma operação a cada elemento de uma coleção, sem retornar um resultado.
		 * Por exemplo, ao iterar sobre uma lista e realizar uma operação em cada elemento.
		 *  
		 */
		
	}

}
