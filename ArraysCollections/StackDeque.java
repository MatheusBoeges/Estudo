package ArraysCollections;

/* Deque é uma classe que representa uma estrutura de dados de pilha, seguindo o princípio LIFO (Last-In, First-Out),
 * ou seja, o último elemento inserido é o primeiro a ser removido.  */

import java.util.ArrayDeque;
import java.util.Deque;

public class StackDeque {
	
	public static void main(String[] args) {
		
		/* Principais Características da Interface:
		 * 
		 * 1 - LIFO: Siga a ordem Last-In, First-Out, onde o último elemento inserido na pilha é o primeiro a ser removido.
		 * 
		 * 
		 * 2 - Métodos de uma Pilha: Fornece métodos como para adicionar elementos ao topo da pilha,
		 *     para remover e retornar o elemento do topo e para visualizar o elemento do topo sem removê-lo.push()pop()peek()
		 * 
		 * 
		 * 3 - Operações Básicas de Pilha: Oferece funcionalidades básicas de uma pilha, permitindo adicionar, remover e inspecionar o elemento no topo da pilha.
		 * 
		 */
		
		Deque<String> livros = new ArrayDeque<>();
		
		/* Ambos os métodos são usados para adicionar um elemento ao início da ,
		 * mas a diferença principal entre eles é o retorno quando a adição falha (geralmente quando a está limitada em capacidade).
		 * Isso se aplica principalmente à implementação específica .
		 * 
		 * 
		 * . add: Este método é herança da interface e é usado para adicionar um elemento ao final da. 
		 * 		  Na maioria das implementações de , incluindo , ele funciona da mesma forma que adicionando o elemento ao final da .Queue
		 * 
		 * 
		 * . push: Este método é herança da interface e é usado para adicionar um elemento ao início da .
		 * 		   Na implementação , também adiciona o elemento ao início, porém, ao contrário do ,
		 *    	   se a adição falhar devido a restrições de capacidade (como quando a atinge seu tamanho máximo), lançará uma exceção 
		 * 
		 */
		
		livros.add("O Pequeno Príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		for(String livro: livros) {
			System.out.println(livro + "\n");
		}
		
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.remove());
		
		//livros.size();
		//livros.clear();
		//livros.contains();
		//livros.isEmpty();
		
		
	}

}
