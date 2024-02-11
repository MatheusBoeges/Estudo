package ArraysCollections.Desafio;

import java.util.Scanner;

public class Arrays1 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas nota você quer informar?");
		int quantidadesDeNotas = entrada.nextInt();
		
		double[] notas = new double[quantidadesDeNotas];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Informe a nota" + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();
		}
		
		double total = 0;
		for(double nota : notas) {
			total += nota;
		}
		
		
		double media = total / notas.length;		
		System.out.println("A média é " + media + "!");
		
		entrada.close();
		
	}

}
