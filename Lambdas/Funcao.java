package Lambdas;

import java.util.function.Function;

public class Funcao {
	
	public static void main(String[] args) {
		
		// Function é uma interface funcional introduzida no Java 8 que representa uma função que aceita um argumento de um tipo e retorna um resultado de outro tipo.
		
		Function<Integer, String> parOuImpar = numero  -> numero % 2 == 0 ? "Par" : "Ímpar";
		
		// A interface Function tem um único método abstrato chamado apply(), que aceita um argumento do tipo genérico T e retorna um resultado do tipo genérico R.
		
		System.out.println(parOuImpar.apply(33));
		System.out.println(parOuImpar.apply(32));
		
		Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;
		
		Function<String, String> empolgado = valor -> valor +"!!!";
		
		// Composição de duas funções
		
		String resultadoFinal1= parOuImpar.andThen(oResultadoE).apply(32);
		
		System.out.println(resultadoFinal1);
		
		// Composição de mais de duas funções
		
		String resultadoFinal2= parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(33);
		
		System.out.println(resultadoFinal2);
		
		/*
		 * Function é frequentemente usada em contextos onde é necessário transformar um valor de entrada em um valor de saída,
		 * como mapeamento de elementos em coleções, conversão de tipos de dados, ou aplicação de regras de negócio.
		 * 
		 */
		
		
	}

}
