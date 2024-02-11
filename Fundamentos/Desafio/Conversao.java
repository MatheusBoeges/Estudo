package Fundamentos.Desafio;

import java.util.Scanner;

public class Conversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro sálario: ");
		String valor1 = entrada.next().replace(",", ".");
		
		System.out.println("Digite o segundo sálario: ");
		String valor2 = entrada.next().replace(",", ".");
		
		System.out.println("Digite o terceiro sálario: ");
		String valor3 = entrada.next().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		
		System.out.println("\nA média dos ultimos três sálarios é: " + media);
		
		entrada.close();
		
	}

}
