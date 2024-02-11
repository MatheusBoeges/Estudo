package EstruturasDeControle.Exercicios;

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String[] args) {
		
		// Criar um programa que receba uma palavra e imprime no console letra por letra.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite uma palavra: ");
		String texto = entrada.next();
		
		for (int i = 0; i <texto.length(); i++) {
			char letra = texto.charAt(i);
			System.out.println(letra);
		}
		
		entrada.close();
		
	}

}
