package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	
	public static void main(String[] args) {
		
		// BinaryOperator é uma interface funcional introduzida no Java 8 que representa uma operação que aceita dois argumentos do mesmo tipo e retorna um resultado do mesmo tipo.
		
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
		
		// Isso significa que BinaryOperator estende a interface BiFunction e tem a mesma assinatura para o método apply(), onde os tipos de entrada e saída são os mesmos.
		
		System.out.println(media.apply(9.8, 5.7));
		
		/*
		 * BinaryOperator é frequentemente usado em contextos onde é necessário aplicar uma operação binária a dois valores do mesmo tipo,
		 * como adição, multiplicação, comparação máxima, comparação mínima, entre outros. 
		 */
		
		Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
		
		System.out.println(media.andThen(conceito).apply(9.8, 5.7) + "\n");
		
		// BiFunction é uma interface funcional introduzida no Java 8 que representa uma função que aceita dois argumentos de entrada de tipos diferentes e retorna um resultado de um tipo especificado.
		
		BiFunction<Double, Double, String> resultado = (n1, n2) -> {
			double notaFinal = (n1 + n2) / 2;
			return notaFinal >= 7 ? "Aprovado" : "Reprovado";
		};
		
		// A interface BiFunction tem um único método abstrato chamado apply(), que aceita dois argumentos de entrada (T e U) e retorna um resultado (R).
		
		System.out.println(resultado.apply(9.7, 4.1));
		
		/*
		 * BiFunction é frequentemente usada em contextos onde é necessário aplicar uma operação que envolve dois argumentos de entrada para produzir um resultado,
		 * como na transformação de dados, na computação de resultados baseados em entradas múltiplas, etc. 
		 */
			
	}

}
