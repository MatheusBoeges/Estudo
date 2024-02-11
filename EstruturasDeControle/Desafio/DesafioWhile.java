package EstruturasDeControle.Desafio;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		// Calcular a média das notas de uma turma.
		
		Scanner entrada = new Scanner(System.in);
		
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.print("Informe a nota (ou -1 para sair): ");
			nota = entrada.nextDouble();
			 
			if(nota <= 10 && nota >= 0) {
			total += nota;
			quantidadeDeNotas++;
			} else if(nota != -1) {
				System.out.println("Nota Inválida!!!");
			}
			
		}
		
		double media = total / quantidadeDeNotas;
		System.out.println("Média = " + media);
				
		entrada.close();
		
	}

}
