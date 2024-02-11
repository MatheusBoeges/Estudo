package EstruturasDeControle;

public class For1 {
	
	/* A estrutura de repetição for é uma das formas para criar uma estrutura de repetição (loop) que permite a execução repetida de um bloco de código.
	 * O loop "for" é uma das estruturas de controle mais comuns e é usado quando você deseja executar um conjunto de instruções um número específico de vezes. */
	
	public static void main(String[] args) {
		
		/* Aqui está a estrutura básica de um loop for:
		 * 
		 * 1 - inicialização: É a parte onde você inicia ou declara a variável de controle do loop.
		 * 2 - condição: É a condição que determina se o loop deve continuar sendo executado.
		 * 3 - atualização: É onde você atualiza a variável de controle do loop após cada iteração. 
		 */
		
		for(int contador1 = 1; contador1 <= 10; contador1++) {
			System.out.printf("c = %d\n", contador1);
		}
		
		System.out.println("");
		
		for(int contador2 = 0; contador2 <= 20; contador2 += 2) {
			System.out.printf("d = %d\n", contador2);	
		}
		
		// Laço infinito!!!
//		for(;;) {
//			System.out.println("Fim!!!!");
//		}
		
	}

}
