package EstruturasDeControle;

import javax.swing.JOptionPane;

public class IfElse {
	
	/* Else é usada para criar blocos de código que são executados quando uma condição específica no bloco "if" correspondente não é verdadeira.
	 * O "else" é uma parte importantedas estruturas condicionais em programação, 
	 * pois permite que você controle o fluxo de execução do código com base em condições. */
	
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe o número:");
		
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) {
			System.out.println("Número par!");
		}else {
			System.out.println("Número ímpar!");
		}
		
	}

}
