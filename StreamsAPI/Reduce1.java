package StreamsAPI;

/*
 * A função reduce() na Stream API do Java é uma operação terminal que permite reduzir os elementos de um stream a um único valor.
 *  Isso é feito aplicando repetidamente uma função binária a um par de elementos, acumulando o resultado.
 *  A função reduce() é especialmente útil para cálculos agregados, como somas, produtos, concatenações, entre outros.
 * 
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
	
	public static void main(String[] args) {
		
		/*
		 * Componentes da função reduce():
		 * 
		 * reduce(BinaryOperator<T> accumulator): 
		 * 
		 *  .Descrição: Aplica a operação de redução especificada aos elementos do stream. O stream não deve estar vazio, caso contrário, a operação retornará um Optional<T> vazio.
		 *  
		 *  . Parâmetro:
		 *    
		 *    . accumulator: Uma função binária que aceita dois elementos do tipo T e retorna um elemento do mesmo tipo.
		 *    
		 */
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (ac, n) -> ac +n;
		
		Integer total1 = nums.stream().reduce(soma).get();
		System.out.println(total1);
		
		Integer total2 = nums.parallelStream().reduce(100, soma);
		System.out.println(total2);
		
		//Resultado foi um Opcional<Integer>...
		nums.stream()
		    .filter(n -> n > 5)
		    .reduce(soma)
		    .ifPresent(System.out::println);
		
		/*
		 * Considerações
		 * 
		 * 1. Imutabilidade: A operação de redução não altera os elementos do stream original.
		 * 
		 * 2. Operação Terminal: reduce() é uma operação terminal, o que significa que executa todas as operações intermediárias definidas anteriormente e retorna um resultado.
		 * 
		 * 3. Paralelismo: A versão com três parâmetros é projetada para funcionar de forma eficiente em streams paralelos,
		 * garantindo que os resultados parciais sejam combinados corretamente.
		 * 
		 * 4. Uso Apropriado: É importante usar reduce() quando o resultado esperado é uma agregação de elementos do stream. 
		 * 
		 */
		
	}

}
