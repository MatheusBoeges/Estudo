package StreamsAPI;

/*
 * As funções skip() e limit() na Stream API do Java são operações intermediárias que permitem pular elementos no início do stream
 * e limitar o número de elementos que o stream processa, respectivamente.
 * Essas funções são úteis para manipular partes específicas de um stream, como quando se deseja implementar paginação ou simplesmente processar uma sublista dos elementos.
 * 
 */

import java.util.Arrays;
import java.util.List;

public class Skip_Limit {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		Aluno a5 = new Aluno("Ana", 7.1);
		Aluno a6 = new Aluno("Pedro", 6.1);
		Aluno a7 = new Aluno("Gui", 8.1);
		Aluno a8 = new Aluno("Maria", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		/*
		 * 1. skip(long n)
		 * 
		 * . Descrição: skip(n) ignora os primeiros n elementos do stream e retorna um novo stream com os elementos restantes.
		 * 
		 * . Parâmetro:
		 * 
		 *   . n: O número de elementos a serem ignorados.
		 *   
		 *   . Comportamento: Se n for maior que o número de elementos no stream, o resultado será um stream vazio.
		 *   
		 */
		
		/*
		 * 2. limit(long maxSize)
		 * 
		 * . Descrição: limit(maxSize) retorna um novo stream que contém, no máximo, os primeiros maxSize elementos do stream.
		 * 
		 * . Parâmetro:
		 * 
		 *   . maxSize: O número máximo de elementos a serem incluídos no novo stream.
		 *   
		 *   . Comportamento: Se maxSize for maior que o número de elementos no stream, todos os elementos do stream original serão incluídos.
		 *   
		 */
		
		alunos.stream()
		      .distinct()
		      .skip(2)
		      .limit(2)
		      .forEach(System.out::println);
		
		/*
		 * Considerações
		 * 
		 * 1.  Ordem das Operações: A ordem das operações intermediárias é importante.
		 * Por exemplo, aplicar limit() antes de skip() pode produzir um resultado diferente de skip() seguido de limit().
		 *
		 * 2. Stream Vazio: Se o número de elementos a serem ignorados por skip() for maior que o número total de elementos no stream, o stream resultante será vazio.
		 * 
		 * 3. Performance: skip() e limit() são operações eficientes e não consomem muita memória, pois processam os elementos de forma sequencial.
		 * 
		 * 4. Comportamento com Streams Paralelos: Essas funções funcionam corretamente com streams paralelos, mas a ordem dos elementos no stream pode influenciar o resultado final.
		 * 
		 * 5. Imutabilidade: Como todas as operações intermediárias na Stream API, skip() e limit() não modificam os elementos originais do stream; eles retornam um novo stream.
		 * 
		 */
	}

}
