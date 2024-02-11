package Fundamentos.Exercicios;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		// Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
		
		Scanner entrada = new Scanner (System.in);
				
		System.out.println("Informe a sua altura:");
		double altura = entrada.nextDouble();
		System.out.println("\nInforme o seu peso:");
		double peso = entrada.nextDouble();
				
		double imc = peso / (altura * altura);
				
		System.out.printf("\nSeu IMC é de %.2f Kg.", imc);
				
		entrada.close();
		
	}

}
