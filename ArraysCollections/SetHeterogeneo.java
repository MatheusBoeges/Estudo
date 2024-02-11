package ArraysCollections;

// Set heterogêneo se refere a um conjunto que contém varios tipos de elementos. 

import java.util.HashSet;
import java.util.Set;

public class SetHeterogeneo {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		// Adicionar elementos a um conjunto ↓
		
		conjunto.add(1.2); // Automaticamente ele converte de um tipo primitivo para uma Classe (Wrappers).
		conjunto.add(true);
		conjunto.add(1);
		conjunto.add("Teste");
		conjunto.add('x');
		
		System.out.println(conjunto);
		
		// Verificar o tamanho do conjunto ↓
		
		System.out.println(conjunto.size());
		
		// Elementos duplicados
		
		conjunto.add("Teste");
		conjunto.add('x');
		
		System.out.println(conjunto.size());
		
		/* Remover elementos repetidos no conjunto ↓
		 * Retorna false quando não a elementos repetidos e true quando a elementos repetidos. */
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		
		System.out.println(conjunto.size());
		
		/* Vereficar se um determinado elemento está contido dentro do conjunto.
		 * Retorna false se o elemento não está contido no conjunto e true quando o elemento está contido no conjunto. */
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		
		// União entre dois conjuntos.
		
		//conjunto.addAll(nums);
		
		System.out.println(conjunto);
		
		// Remover todos os elementos do conjunto atual que não estão presentes na coleção fornecida, mantendo apenas os elementos que são comuns a ambos os conjuntos.
		
		conjunto.retainAll(nums);
		
		System.out.println(conjunto);
		
		// Limpar o conjunto.
		
		conjunto.clear();
		
		System.out.println(conjunto);
		
	}

}
