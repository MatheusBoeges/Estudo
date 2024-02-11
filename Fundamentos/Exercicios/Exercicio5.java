package Fundamentos.Exercicios;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		// Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
		
		Scanner entrada = new Scanner (System.in);
				
		System.out.println("Informe o valor da base:");
		double base = entrada.nextDouble();
				
		System.out.println("Informe o valor da altura:");
		double altura = entrada.nextDouble();
				
		double area = (base * altura) / 2;
				
		System.out.println("A área do triangulo é: " + area);
				
		entrada.close();
				
	}

}
