package EstruturasDeControle;

import java.util.Scanner;

public class DoWhile {
	
	/* A estrutura de repetição "do-while" é uma das estruturas de controle de loop utilizadas em programação. Ela é semelhante ao "while", mas com uma diferença crucial:
	 * no "do-while", o bloco de código é executado pelo menos uma vez, mesmo que a condição seja inicialmente falsa.
	 * Depois da primeira execução, a condição é avaliada, e o bloco continuará a ser executado enquanto a condição for verdadeira. */
	
	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		/* No "do-while", o bloco de código é executado primeiro e, em seguida, a condição é verificada.
		 * Se a condição for verdadeira, o bloco de código será executado novamente; caso contrário, o loop terminará. */
		
		do {
			System.out.println("Você precisa falar as palavras mágicas...");
			System.out.print("Quer sair?");
			texto = entrada.nextLine();
		}while(!texto.equalsIgnoreCase("por favor"));
		
		
		/* O "do-while" é útil quando você precisa garantir que um bloco de código seja executado pelo menos uma vez, mesmo que a condição inicial seja falsa.
		 *  É uma escolha apropriada quando você deseja que o código dentro do loop seja executado antes de verificar se a condição de saída foi atendida. */
		
		System.out.println("Obrigado!");
		
		entrada.close();
		
	}

}
