package Fundamentos.Exercicios;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		// Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
		
		Scanner entrada = new Scanner (System.in);
				
		double fator = 32;
		double ajuste = 1.8;
				
		System.out.println("Informe a temperatura:");
		double celsius = entrada.nextDouble();
		double fahrenheit = (celsius * ajuste) + fator;
				
		System.out.printf("A temperatura em Fº é : %.2f", fahrenheit);
				
		entrada.close();
		
	}

}
