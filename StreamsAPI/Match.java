package StreamsAPI;

/*
 * Na Stream API do Java, as funções anyMatch(), allMatch() e noneMatch() são operações terminais que verificam se os elementos de um stream satisfazem uma determinada condição.
 * Essas operações são usadas para realizar verificações booleanas em streams e retornam um valor booleano com base nos resultados das verificações.
 *  
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovados = a -> a.nota >= 7;
		Predicate<Aluno> reprovados = aprovados.negate();
		
		/* 
		 * anyMatch(Predicate<? super T> predicate):
		 * 
		 * . Descrição: Verifica se algum elemento do stream satisfaz a condição especificada pelo predicado.
		 * 
		 * . Retorno: true se pelo menos um elemento satisfizer o predicado; false caso contrário.
		 * 
		 * . Parâmetro:
		 * 
		 *    . predicate: Uma função que recebe um elemento e retorna um booleano.
		 * 
		 */
		
		System.out.println(alunos.stream().allMatch(aprovados));
		
		/*
		 * allMatch(Predicate<? super T> predicate):
		 * 
		 * . Descrição: Verifica se todos os elementos do stream satisfazem a condição especificada pelo predicado.
		 * 
		 * . Retorno: true se todos os elementos satisfizerem o predicado; false caso contrário.
		 * 
		 * . Parâmetro:
		 * 
		 *     . predicate: Uma função que recebe um elemento e retorna um booleano.
		 * 
		 */
		
		System.out.println(alunos.stream().anyMatch(aprovados));
		
		/*
		 * noneMatch(Predicate<? super T> predicate):
		 * 
		 * . Descrição: Verifica se nenhum dos elementos do stream satisfaz a condição especificada pelo predicado.
		 * 
		 * . Retorno: true se nenhum elemento satisfizer o predicado; false caso contrário.
		 * 
		 * . Parâmetro:
		 * 
		 *     . predicate: Uma função que recebe um elemento e retorna um booleano. 
		 * 
		 */
		
		System.out.println(alunos.stream().noneMatch(reprovados));
		
		/*
		 * Considerações
		 * 
		 * . Curto-Circuito: Essas funções são operações de curto-circuito, o que significa que elas param de processar assim que a condição é satisfeita (anyMatch), insatisfeita (allMatch), ou violada (noneMatch).
		 * 
		 * .Imutabilidade: Como todas as operações de stream, anyMatch(), allMatch(), e noneMatch() não modificam os elementos originais do stream.
		 * 
		 * .Eficiência: São ideais para verificações rápidas em streams potencialmente longos, pois podem evitar processar todos os elementos.
		 * 
		 */
		
	}

}
