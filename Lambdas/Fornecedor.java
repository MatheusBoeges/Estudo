package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	
	public static void main(String[] args) {
		
		// Supplier é uma interface funcional introduzida no Java 8 que não recebe nenhum argumento, mas retorna um resultado.
		
		Supplier<List<String>> umaLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		// A interface Supplier tem um único método abstrato chamado get(), que não aceita nenhum argumento e retorna um resultado do tipo genérico T.
		
		System.out.println(umaLista.get());
		
		/*
		 * Supplier é frequentemente usada em contextos onde é necessário fornecer valores sob demanda,
		 * como na geração de valores aleatórios, na criação de objetos ou na obtenção de dados de uma fonte externa.
		 * 
		 */
		
	}

}
