package EstruturasDeControle.Exercicios;

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[] args) {
		
		/* Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números inseridos,
		 * caso receba um número negativo, encerre o programa. */
		
		Scanner entrada = new Scanner(System.in);
		
		int somadorDeNumeros = 0; 
		int numero = 0;
		
		while (numero >= 0) {
			System.out.print("Digite um númeto inteiro (ou um número negativo para sair): ");
			numero = entrada.nextInt();
		
		
			if (numero >=0) {
				somadorDeNumeros += numero;
				System.out.printf("\nA soma até o momento é: %d\n", somadorDeNumeros);
			}
			
		}
			
		entrada.close();
		
	}

}
