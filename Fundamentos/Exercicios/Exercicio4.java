package Fundamentos.Exercicios;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
				
		// Criar um programa que leia um número e apresente os resultados ao quadrado e ao cubo do valor.

		Scanner entrada = new Scanner (System.in);
				
		System.out.print("Informe um número: ");
		double valor = entrada.nextDouble();
				
		double quadrado = Math.pow(valor, 2);
		double cubo = Math.pow(valor, 3);
				
		System.out.println("O número elevado ao quadrado é: " + quadrado);
		System.out.println("O número elevado ao cubo é: " + cubo);
				
		entrada.close();
		
	}

}
