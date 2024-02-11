package Fundamentos.Exercicios;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
	
		// Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
		
		Scanner entrada = new Scanner (System.in);
				
		double fator = 1.8;
		double ajuste = 32;
				
		System.out.println("Informe a temperatura:");
		double fahrenheit = entrada.nextDouble();
		double celsius = (fahrenheit - ajuste) / fator;
				
		System.out.printf("A temperatura em graus Cº é : %.2f", celsius);
				
		entrada.close();
		
	}

}
