package Lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	
	public static void main(String[] args) {
		
		// UnaryOperator é uma interface funcional introduzida no Java 8 que representa uma operação que aceita um único argumento do mesmo tipo e retorna um resultado do mesmo tipo.
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		// Isso significa que UnaryOperator estende a interface Function e tem a mesma assinatura para o método apply(), onde o tipo de entrada e saída são os mesmos.
		
		int resultado1 = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0);
		
		System.out.println(resultado1);
		
		// O compose lê ao contrario
		
		int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(0);
		
		System.out.println(resultado2);
		
		/*
		 * UnaryOperator é frequentemente usado em contextos onde é necessário aplicar uma operação unária (ou seja, uma operação que requer apenas um operando),
		 * a um valor do mesmo tipo, como incremento, negação, aplicação de uma função matemática, entre outros.
		 *  
		 */
		
	}

}
