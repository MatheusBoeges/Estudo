package EstruturasDeControle;

public class BreakRotulado {
	
	/* A instrução break rotulado, também conhecida como "break com rótulo" que permite sair de um loop ou de um bloco específico identificado por um rótulo.
	 * Isso é útil quando você tem loops aninhados e deseja sair de um loop específico, não do loop mais interno. */
	
	public static void main(String[] args) {
		
		// Neste exemplo, o rótulo externo é definido antes do loop externo
		
		externo: for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
				
						if(i == 1) {
							break externo;
				}
						
						System.out.printf("{%d %d}", i, j);
			}
					
					System.out.println();
					
		}
		
		System.out.println("Fim!");
		
	}

}
