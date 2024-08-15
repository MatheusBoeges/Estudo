package StreamsAPI;

/*
 * A função map() na Stream API do Java é uma operação intermediária que transforma os elementos de um stream aplicando uma função de mapeamento a cada elemento.
 *  Essa operação produz um novo stream contendo os resultados da aplicação dessa função.
 * 
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
	
	public static void main(String[] args) {
		
		/*
		 * Componentes da função map()
		 * 
		 * 1. Tipo Genérico <R>: Define o tipo dos elementos do stream de saída. 
		 * 
		 * 2. Stream<R>: O tipo de retorno é um stream de elementos do tipo <R>.
		 * 
		 * 3. Function<? super T, ? extends R> mapper: A função de mapeamento que será aplicada a cada elemento do stream:
		 * 
		 * 		. T representa o tipo dos elementos do stream de entrada.
		 * 		
		 * 		. R representa o tipo dos elementos do stream de saída.
		 * 
		 */
		
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW, ", "Audi, ", "Honda");
		
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		//UnaryOperator<String> maiuculas = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		//UnaryOperator<String> grito = n -> n + "!!! ";
		
		/*
		 * Como Funciona:
		 * 
		 * A função map() aplica a função especificada (mapper) a cada elemento do stream, transformando-os de acordo com a lógica definida na função de mapeamento.
		 *  O stream resultante contém elementos do tipo definido pela função de mapeamento.
		 * 
		 */
		
		System.out.println("\n\nUsando a composição");
		marcas.stream()
		.map(Utilitarios.maiuculas)
		.map(primeiraLetra)
		.map(Utilitarios::grito)
		.forEach(print);
		
		/*
		 * Detalhes Importantes:
		 * 
		 * . Operação Preguiçosa: map() é uma operação preguiçosa, ou seja, ela não é executada até que uma operação terminal seja invocada no stream.
		 * 
		 * . Imutabilidade: Os elementos originais do stream não são modificados; um novo stream é criado com os elementos transformados.
		 * 
		 * . Sequencial ou Paralelo: map() pode ser usado em streams sequenciais ou paralelos, o que permite processamento paralelo eficiente de grandes volumes de dados.
		 *
		 */
		
	}

}
