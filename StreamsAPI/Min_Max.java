package StreamsAPI;

/*
 * As funções min() e max() na Stream API do Java são operações terminais que permitem encontrar o menor e o maior elemento de um stream, respectivamente.
 * Essas funções utilizam um Comparator para determinar a ordem dos elementos.
 *  
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Min_Max {
	
	public static void main(String[] args) {
		
		/*
		 * Componentes das Funções
		 * 
		 * . Optional<T>: O tipo de retorno de ambas as funções é um Optional<T>, que pode conter o elemento mínimo ou máximo, ou estar vazio se o stream estiver vazio.
		 * 
		 * . Comparator<? super T> comparator: Um objeto Comparator que define a ordem dos elementos do stream.
		 * 
		 */
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
			if(aluno1.nota > aluno2.nota) return 1;
			if(aluno1.nota < aluno2.nota) return-1;
			return 0;
		};
		
		Comparator<Aluno> piorNota = (aluno1, aluno2) -> {
			if(aluno1.nota > aluno2.nota) return -1;
			if(aluno1.nota < aluno2.nota) return 1;
			return 0;
		};
		
		/*
		 * Como Funcionam:
		 * 
		 * As funções min() e max() aplicam o Comparator especificado a todos os elementos do stream para encontrar, respectivamente, o menor e o maior elemento.
		 * 
		 */
		
		System.out.println(alunos.stream().max(melhorNota).get());
		System.out.println(alunos.stream().min(melhorNota).get());
		
		System.out.println(alunos.stream().max(piorNota).get());
		System.out.println(alunos.stream().min(piorNota).get());
		
		/*
		 * Considerações
		 * 
		 * . Optional: O uso de Optional<T> como retorno é útil para evitar problemas de NullPointerException quando o stream está vazio.
		 * 
		 * . Comparators Personalizados: É possível fornecer comparators personalizados para definir critérios complexos de comparação entre elementos.
		 * 
		 * . Imutabilidade: Como todas as operações de stream, min() e max() não modificam os elementos originais do stream.
		 * 
		 * . Operação Terminal: Ambas as funções são operações terminais, o que significa que executam todas as operações intermediárias definidas anteriormente no stream e retornam um resultado.
		 * 
		 */
		
	}

}
