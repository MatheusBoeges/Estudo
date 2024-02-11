package EstruturasDeControle.Exercicios;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		// Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o numero: ");
		int numero = entrada.nextInt();
		
		if(numero >= 0 && numero <= 10) {
			System.out.println("\nO número " + numero +  " está entre 0 e 10");
		}
			
		if(numero % 2 == 0) {
			System.out.println("\nO número " + numero + " é par.");
		} else {
			System.out.println("\nO número " + numero + " é ímpar.");
		}
		
		entrada.close();
		
	}

}
