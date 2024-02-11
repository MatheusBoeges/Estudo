package ArraysCollections;

/* List representa uma coleção ordenada de elementos onde é possível armazenar elementos duplicados.
 * Uma List mantém a ordem de inserção dos elementos e permite acessar os elementos por meio de um índice numérico. */

import java.util.ArrayList;

public class List {
	
	public static void main(String[] args) {
		
		/* Características Principais da List:
		 * 
		 * 1 - Ordenação dos Elementos: Os elementos em uma List são mantidos na sequência em que são inseridos.
		 * 
		 * 2 - Acesso por Índice: Elementos em uma List podem ser acessados por meio de índices numéricos (começando em 0 para o primeiro elemento).
		 * 
		 * 3 - Aceita Elementos Duplicados: Uma List pode conter elementos duplicados.
		 * 
		 * 4 - Iteração Ordem de Inserção: Ao iterar sobre uma List, os elementos são retornados na ordem em que foram inseridos.
		 * 
		 */
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu"));
		
		// Retorna o elemento na posição especificada pelo índice.
		
		System.out.println(lista.get(3) + "\n");
		
		// Removendo pelo índice.
		
		System.out.println("Usuario removido >>>> " + lista.remove(1) + "\n");
		
		//Removendo pelo objeto.
		
		System.out.println(lista.remove(new Usuario ("Manu")) + "\n");
		System.out.println(lista.remove(new Usuario ("Manu")) + "\n");
		System.out.println(lista.remove(new Usuario ("Manu")) + "\n" );
		
		System.out.println("Existe? " + lista.contains(new Usuario ("Lia")) + "\n");
				
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
		
	}
	
}
