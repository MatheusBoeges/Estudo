package EstruturasDeControle;

import java.util.Scanner;

public class WhileIndeterminado {
	
	/* Um "while indeterminado" refere-se a um loop while que não tem uma condição de parada explícita ou cuja condição de parada é determinada durante a execução do programa
	 * com base em alguma lógica ou entrada. Em outras palavras, o loop while continuará a ser executado até que uma condição específica seja atendida,
	 * mas essa condição pode não ser conhecida antecipadamente e pode depender de eventos ou dados do programa. */
	
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);	
	
	System.out.println("Para poder sair do Scanner digite sair");
	
	String valor ="";
	
	while(!valor.equalsIgnoreCase("sair")) {
		System.out.print("\nVocê diz:");
		valor = entrada.nextLine();
	}
		
	entrada.close();
		
	}
	
}
