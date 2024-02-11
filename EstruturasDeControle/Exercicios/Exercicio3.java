package EstruturasDeControle.Exercicios;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		/* Criar um programa que receba duas notas parciais, calcular a média final. Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado",
		 * se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", caso contrário imprime no console "Reprovado". */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a primeira nota:");
		double nota1 = entrada.nextDouble();
		
		System.out.print("\nInforme a segunda nota:");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if(media >= 7.0 && media <= 10.0) {
			System.out.println("\nO aluno está aprovado.");
		} else if (media < 7.0 && media >= 4.0) {
			System.out.println("\nO aluno está em recuperação");
		} else if(media < 4.0 && media >= 0) { 
			System.out.println("\nO aluno está reprovado");
		} else if(media !=0 && media !=10) {
			System.out.println("\nErro não foi possivel calcular a média, por gentileza verifique se as notas lançadas estão corretas");
		}
		
		entrada.close();
		
	}

}
