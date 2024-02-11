package ArraysCollections;

/* O enhanced for loop, ou foreach loop, é uma construção de loop conveniente e simplificada.
 *  Ele simplifica a iteração por arrays ou coleções sem a necessidade de usar um contador ou um índice explícito.
 *  Este tipo de loop é especialmente útil quando você quer iterar sobre todos os elementos de um array ou de uma coleção. */

public class Foreach {
	
	public static void main(String[] args) {
		
		double[] notas = {9.9, 9.8, 7.2, 9.4};
		
		/* A estrutura básica do foreach loop é a seguinte:
		 * 
		 * 1 - tipo: é o tipo de dado dos elementos na coleção.
		 * 
		 * 2 - elemento: é uma variável que representa cada elemento na iteração.
		 * 
		 * 3 - colecao: é o array ou coleção sobre a qual você deseja iterar.
		 */
		
		for(double nota : notas) {
			System.out.println(nota);
		}
		
		/* O foreach loop é uma forma mais simples e legível de percorrer coleções em comparação com os loops tradicionais (for ou while).
		 * Ele melhora a clareza do código, eliminando a necessidade de gerenciar explicitamente os índices ou contadores de loop. */
		
	}

}
