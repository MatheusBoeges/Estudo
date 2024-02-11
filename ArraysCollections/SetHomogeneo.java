package ArraysCollections;

// Set é uma coleção que armazena elementos únicos, ou seja, não permite elementos duplicados.

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetHomogeneo {
	
	public static void main(String[] args) {
		
		/* Características Principais do Set:
		 * 
		 * 1 - Elementos Únicos: Um Set não permite a inserção de elementos duplicados.
		 * 		Se você tentar adicionar um elemento que já existe no conjunto, a operação de adição não terá efeito.
		 * 
		 * 
		 * 2 - Sem Ordenação Específica: A implementação mais comum de Set, como HashSet, não garante a ordem de inserção dos elementos.
		 * 
		 * 
		 * 3 - Não Permite Elementos Nulos: Na maioria das implementações, um Set não permite a adição de elementos nulos.
		 * 		No entanto, geralmente existe uma exceção, como HashSet, que permite um único elemento nulo.
		 * 
		 */
		
		Set<Integer> nums = new HashSet<>();
		
		nums.add(1);
		nums.add(10);
		nums.add(100);
		nums.add(110);
		
		for (int n: nums) {
			System.out.println(n + "\n");
		}
		
		/* Assim como um Set comum, um SortedSet epresenta um conjunto (coleção de elementos únicos) ordenado.
		 * Os elementos em um SortedSet são mantidos em uma ordem específica. Essa ordem pode ser a ordem natural dos elementos ou a ordem especificada por um comparador. */
		
		SortedSet<String> listaAprovados = new TreeSet<>();
		
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Lucas");
		listaAprovados.add("Pedro");
		
		System.out.println("Meus parabéns alunos que foram aprovados: ");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		System.out.println();
		
		SortedSet<String> listaReprovados = new TreeSet<>();
		
		listaReprovados.add("Matheus");
		listaReprovados.add("Erica");
		listaReprovados.add("Miguel");
		listaReprovados.add("Gabriel");
		
		System.out.println("\nNão deixe que uma reprovação te abale: ");
		
		for(String candidato: listaReprovados) {
			System.out.println(candidato);
		}
		
		/* Set é uma ótima escolha quando você precisa armazenar elementos únicos sem se preocupar com a ordem específica dos elementos.
		 * As implementações mais comuns de Set incluem HashSet, LinkedHashSet e TreeSet.
		 * Cada uma tem suas características específicas em termos de desempenho e comportamento. */
		
	}

}
