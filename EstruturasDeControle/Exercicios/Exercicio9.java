package EstruturasDeControle.Exercicios;

import java.util.Scanner;

public class Exercicio9 {
	
	public static void main(String[] args) {
		
		//  Crie um programa que recebe 10 valores e ao final imprima o maior número.
		
		Scanner entrada = new Scanner(System.in);
		
		int maiorValor = 0;
		int contador = 0;
		
		do {
			System.out.println("Digite um número: ");
			int valor = entrada.nextInt();
			
			if (valor> maiorValor) {
				maiorValor = valor;
			}
		
		contador++;
		
		} while (contador != 10);
		
		System.out.printf("O maior valor foi: " + maiorValor);
		
		entrada.close();
		
	}

}
