package EstruturasDeControle;

public class Break {
	
	/* A instrução break é utilizada para interromper a execução de loops (for, while, do-while) e switches.
	 * O principal propósito do break é sair prematuramente de uma estrutura de controle de fluxo. */
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			if (i == 5) {
				break;
			}
			
			System.out.println(i);
			
		}
		
		System.out.println("Fim!");
		
	}

}
