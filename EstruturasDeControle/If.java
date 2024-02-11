package EstruturasDeControle;

import java.util.Scanner;

public class If {
	
	// O "if" permite que você execute um bloco de código somente se uma condição específica for avaliada como verdadeira.
	
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Informe a média:");
	double media = entrada.nextDouble();
	
	if(media <= 10 && media >= 7.0) { // Primeiro começamos com uma expressão. Que retorna true or false.
		System.out.println("Aprovado!");
		System.out.println("Parabéns!");
	}
	
	if(media < 7.0 && media >= 4.5) {
		System.out.println("Em recuperação");
	}
	
	/* Se tivermos varias expressões  podemos salvar em varias variaveis do tipo booelan 
	 * ex: criterioReprovacaoAtingindo = media < 4.5 && media >= 0;
	 * if(criterioReprovacaoAtingindo) {
	 * 		System.out.println("Reprovado"); 
	 * } */
	
	
	if(media < 4.5 && media >= 0 ) {
		System.out.println("Reprovado");
	}
	
	entrada.close();
			
	}

}
