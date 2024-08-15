package StreamsAPI;

/*
 * A função distinct() na Stream API do Java é uma operação intermediária que retorna um novo stream que contém elementos únicos, ou seja,
 * remove elementos duplicados do stream original. Esta função é particularmente útil quando você deseja eliminar valores repetidos de uma coleção ou sequência de dados.
 *  
 */

import java.util.Arrays;
import java.util.List;

public class Distinct {
	
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
		 * Como Funciona a Função distinct()
		 * 
		 * . Operação Intermediária: distinct() é uma operação intermediária que retorna um novo stream com elementos distintos do stream original.
		 * 
		 * . Baseada em equals(): A função utiliza o método equals() dos objetos para determinar a unicidade.
		 * Portanto, para que a função funcione corretamente, os objetos devem implementar corretamente o método equals() (e, consequentemente, hashCode()).
		 * 
		 * . Imutabilidade: Os elementos originais do stream não são alterados. Um novo stream é criado contendo apenas os elementos distintos. 
		 * 
		 */
		
		alunos.stream()
		      .distinct()
		      .forEach(System.out::println);
		
		/*
		 * Considerações Importantes
		 * 
		 * 1. Desempenho: A operação distinct() pode ser custosa em termos de desempenho se o stream contiver um grande número de elementos, pois a função precisa verificar a unicidade de cada elemento.
		 * 
		 * 2. Imutabilidade: O stream original não é modificado; em vez disso, um novo stream é criado.
		 * 
		 * 3. Paralelismo: distinct() pode ser usado em streams paralelos, mas isso pode impactar o desempenho devido à necessidade de sincronização para garantir a unicidade. 
		 * 
		 */
		
	}

}
