package EstruturasDeControle.Exercicios;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		// Refatorar o exercício 04, utilizando a estrutura switch.
		
		int contadorDeDivisores = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número para ferificar se é primo: ");
		int numero = entrada.nextInt();
		
		for(int i = 2; i < numero; i++) {
			if(numero % 1 == 0) {
				contadorDeDivisores++;
			}
		}
		
		switch (contadorDeDivisores) {
		case 0:
			System.out.println("\nO número " + numero + " é primo.");
			break;
		default:
			System.out.println("\nO número " + numero + " não é primo.");
		}
		
		entrada.close();
		
	}

}
