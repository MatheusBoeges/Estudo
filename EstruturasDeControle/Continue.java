package EstruturasDeControle;

public class Continue {
	
	/* A instrução continue é usada em loops (como for, while e do-while) para pular a iteração atual e passar para a próxima iteração do loop.
	 * Em outras palavras, quando continue é encontrado dentro de um loop, o restante do código dentro do loop é ignorado para a iteração atual,
	 * e o loop continua com a próxima iteração. */
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			if (i % 2 == 1) {
				continue;
			}
			
			System.out.println(i);
			
		}
		
		System.out.println("Fim!");
		
		System.out.println();
		
		for (int i = 1; i <= 10; i++) {
			
			if (i == 5) {
				continue;
			}
			
			System.out.println(i);
			
		}
		
		System.out.println("Fim!");
		
	}

}
