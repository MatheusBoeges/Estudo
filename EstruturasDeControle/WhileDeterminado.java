package EstruturasDeControle;

public class WhileDeterminado {
	
	/* A estrutura de repetição while é usada para criar loops, permitindo que um bloco de código seja executado repetidamente enquanto uma determinada condição for verdadeira.
	 * Um loop while com uma condição determinada é aquele em que a condição de parada é definida por você de forma explícita, de acordo com a lógica do seu programa. */
	
	
	public static void main(String[] args) {
		
		/* Aqui está a estrutura básica de um loop while:
		 * 
		 * O bloco de código dentro do while é repetido enquanto a condição especificada no parênteses for verdadeira.
		 * É importante garantir que a condição eventualmente se torne falsa, caso contrário, o loop será executado indefinidamente, resultando em um "loop infinito". */
		
		
		int contador1 = 1;
		
		while(contador1 <= 10) {
			System.out.printf("a = %d\n", contador1);
			contador1++;
		}
		 
		System.out.println("");
		
		int contador2 = 0;
		
		while(contador2 <= 20) {
			System.out.printf("b = %d\n", contador2);
			contador2 += 2;
		}
		
	}

}
