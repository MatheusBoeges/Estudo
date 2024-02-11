package EstruturasDeControle.Exercicios;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		// Criar um programa informa se o ano atual é um ano bissexto;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o ano: ");
		int ano = entrada.nextInt();
		
		if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
			System.out.println("\nO ano " + ano + " é bissexto.");
		} else {
			System.out.println("\nO ano " + ano + " não é bissexto.");
		}
		
		entrada.close();
		
	}

}
