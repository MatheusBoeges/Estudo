package ArraysCollections;

/* Queue é uma interface que representa uma coleção de elementos organizada no formato de fila (FIFO - First-In-First-Out),
 * onde o primeiro elemento adicionado é o primeiro a ser removido. */

import java.util.LinkedList;
import java.util.Queue;

public class Queeu {
	
	public static void main(String[] args) {
		
		/* Características Principais da Interface:
		 * 
		 * 1 - FIFO (First-In-First-Out): Os elementos são adicionados ao final da fila e removidos do início da fila.
		 * 
		 * 
		 * 2 - Inserção e Remoção: A Queue suporta operações de inserção (offer()), remoção (poll()),
		 * 		verificação do próximo elemento a ser removido sem removê-lo (peek()), entre outras operações.
		 * 
		 * 
		 * 3 - Aceita Elementos Nulos e Duplicados: Queue permite a inclusão de elementos nulos e elementos duplicados.
		 * 
		 */
		
		Queue<String> fila = new LinkedList<>();
		
		/* offer:  tenta adicionar o elemento ao final da fila.
		 * .Se a operação for bem-sucedida (ou seja, se houver espaço disponível na fila), o método retorna true.
		 * .Se a fila estiver cheia e não for possível adicionar o elemento, o método offer() retorna false. */
		
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		/* Os métodos add() e offer() são bastante semelhantes para adicionar elementos à fila,
		 * mas possuem comportamentos ligeiramente diferentes quando a fila atinge sua capacidade máxima (quando ela é limitada, por exemplo, em uma fila com tamanho fixo).
		 * 
		 * 
		 * . add: Ele retorna true se o elemento for adicionado com sucesso ou lança uma exceção 
		 * (IllegalStateException) se a adição não for possível devido a restrições de capacidade.
		 *
		 * 
		 * . offer: Ele retorna true se o elemento for adicionado com sucesso ou retornara null se a adição falhar devido a restrições de capacidade 
		 * (por exemplo, quando a fila atinge seu tamanho máximo), indicando que o elemento não pôde ser adicionado, sem lançar exceções.
		 * 
		 */
		
		for (String filas: fila) {
			System.out.println(filas);
		}
		
		System.out.println();
		
		/* Ambos, peek() e element(), são usados para retornar o próximo elemento na fila sem removê-lo.
		 * No entanto, há uma diferença sutil no comportamento entre eles em relação ao tratamento de filas vazias:
		 * 
		 * . peek(): Retorna o próximo elemento na fila sem removê-lo. Se a fila estiver vazia, ou seja, não tiver elementos, o método peek() retornará null.
		 * 
		 * . element(): Similar ao peek(), retorna o próximo elemento na fila sem removê-lo.
		 * 	No entanto, se a fila estiver vazia, ou seja, não tiver elementos, o método element() lançará uma exceção NoSuchElementException.
		 * 
		 */
		
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		System.out.println();
		
		/* 	O método isEmpty() é usado para verificar se a fila está vazia, ou seja, se não contém nenhum elemento.
		 * Ele retorna true se a fila estiver vazia e false se a fila contiver algum elemento. */
		
		System.out.println(fila.isEmpty());
		
		System.out.println();
		
		/* Tanto o método poll() quanto o método remove() são utilizados para remover e retornar o próximo elemento da fila em Java,
		 * mas eles têm comportamentos diferentes quando a fila está vazia.
		 * 
		 * . poll(): Este método remove e retorna o próximo elemento na fila. Se a fila estiver vazia, ou seja, não tiver elementos, o método poll() retornará null.
		 * 
		 * 
		 * . remove(): Similar ao poll(), remove e retorna o próximo elemento na fila.
		 * 	No entanto, se a fila estiver vazia, ou seja, não tiver elementos, o método remove() lançará uma exceção NoSuchElementException.
		 * 
		 */
		
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		// fila.size();
		// fila.clear();
		// fila.contains(...));
		
	}

}
