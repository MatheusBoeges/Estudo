package EstruturasDeControle;

import java.util.Scanner;

public class SwitchComBreak {
	
	/* A instrução switch é utilizada para realizar múltiplas comparações sobre o valor de uma expressão e executar blocos de código associados aos casos correspondentes.
	 * É importante notar que, após a execução do bloco associado a um caso, a instrução break é usada para sair do switch.
	 * Isso evita que os blocos dos casos subsequentes sejam executados. */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String conceito = "";
		System.out.print("Informe a nota: ");
		int nota = entrada.nextInt();
		
		switch(nota) {
		case 10: case 9:
			conceito = "A";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;
		case 2: case 1: case 0:
			conceito = "E";
			break;
		default:
			conceito = "não encontrado";
			break;
		}
		
		System.out.println("Conceito é " + conceito);
		
		entrada.close();
		
	}

}
