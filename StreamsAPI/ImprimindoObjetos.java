package StreamsAPI;

/*
 * A Stream API do Java é uma funcionalidade introduzida no Java 8 que permite o processamento eficiente e declarativo de coleções de dados.
 * Ela fornece uma forma de realizar operações sobre dados de maneira concisa e paralela, facilitando o processamento em massa de coleções. 
 * 
 */

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	
	public static void main(String[] args) {
		
		/*
		 * Aqui estão os principais conceitos e características da Stream API:
		 * 
		 * . Collections: São armazenamentos de dados na memória (como List, Set, Map) onde os dados são manipulados diretamente.
		 * 
		 * . Streams: Não armazenam dados.Em vez disso, eles processam dados de uma fonte,
		 * permitindo operações de alto nível e mais focadas em descrever o que deve ser feito, não como fazer.
		 * 
		 */
		
		List<String> aprovados = Arrays.asList("lu", "Gui", "Luca", "Ana");
		
		System.out.println("Usando o foreach...");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nUsando Iterator...");
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.hasNext());
		}
		
		/*
		 * Streams são imutáveis, o que significa que, quando você aplica uma operação, um novo stream é criado.
		 * Isso promove um estilo de programação funcional, onde você descreve operações sem alterar o estado dos objetos.
		 * 
		 */
		
		System.out.println("\nUsando Stream");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
		
		/*
		 * Benefícios da Stream API
		 * 
		 * . Expressividade: A Stream API permite escrever código mais conciso e expressivo, concentrando-se no que você deseja fazer em vez de como fazê-lo.
		 * 
		 * . Paralelismo: Simplifica o processamento paralelo de coleções.
		 * 
		 * . Imutabilidade: Promove um estilo de programação funcional, tornando o código mais seguro e menos propenso a erros de concorrência. 
		 * 
		 */
		
	}

}
