package StreamsAPI;

/*
 * A função filter() na Stream API do Java é uma operação intermediária que permite filtrar elementos de um stream com base em um predicado (condição).
 *  Somente os elementos que atendem a essa condição são mantidos no stream resultante. 
 * 
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	
	public static void main(String[] args) {
		
		/*
		 * Componentes da função filter():
		 * 
		 * . Stream<T>: O tipo de retorno é um stream com elementos do mesmo tipo do stream de entrada.
		 * 
		 * . Predicate<? super T> predicate: Um predicado é uma função que recebe um elemento do stream e retorna um valor booleano (true ou false).
		 *  Se o predicado retornar true, o elemento será incluído no stream resultante; caso contrário, será excluído.
		 * 
		 */
		
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Bia", 5.8);
		Aluno a3 = new Aluno("Daniel", 9.8);
		Aluno a4 = new Aluno("Gui", 6.8);
		Aluno a5 = new Aluno("Rebeca", 7.1);
		Aluno a6 = new Aluno("Pedro", 8.8);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		
		Function<Aluno, String> saudacao = a -> "Parabéns " + a.nome + "! Você foi aprovado(a)!";
		
		/*
		 * Como Funciona:
		 * 
		 * A função filter() processa cada elemento do stream aplicando o predicado especificado.
		 *  Os elementos que satisfazem a condição do predicado são incluídos no stream resultante, enquanto os que não satisfazem são descartados.
		 * 
		 */
		
		alunos.stream()
		      .filter(aprovado)
		      .map(saudacao)
		      .forEach(System.out::println);
		
		/*
		 * Detalhes Importantes:
		 * 
		 * . Operação Preguiçosa: Assim como map(), filter() é uma operação preguiçosa, o que significa que ela não é executada até que uma operação terminal seja invocada no stream.
		 * 
		 * . Imutabilidade: Os elementos originais do stream não são modificados; um novo stream é criado contendo apenas os elementos que atendem à condição.
		 * 
		 * . Sequencial ou Paralelo: filter() pode ser usado em streams sequenciais ou paralelos, permitindo processamento paralelo eficiente quando necessário.
		 * 
		 * . Reutilização de Streams: Um stream que foi consumido (após uma operação terminal) não pode ser reutilizado; tentar isso resultará em uma exceção (IllegalStateException).
		 * 
		 */
		
	}

}
