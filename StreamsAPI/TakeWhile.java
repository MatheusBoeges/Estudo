package StreamsAPI;

/*
 * A função takeWhile() na Stream API do Java é uma operação intermediária introduzida no Java 9.
 * Essa função é usada para tomar elementos do stream enquanto uma determinada condição (predicado) for verdadeira.
 * A partir do momento em que a condição for falsa, o stream para de coletar elementos, mesmo que o predicado se torne verdadeiro novamente para elementos subsequentes.
 *  
 */

import java.util.Arrays;
import java.util.List;

public class TakeWhile {
	
	/*
	 * Comparação com filter()
	 * 
	 * A função takeWhile() pode parecer semelhante a filter(), mas há uma diferença chave:
	 * 
	 * . filter() processa todos os elementos do stream e aplica a condição a cada um deles, independentemente da ordem.
	 * 
	 *  .takeWhile() processa os elementos na ordem do stream e para no primeiro elemento que não satisfaz a condição.
	 * 
	 */
	
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
		 * Parâmetros
		 * 
		 * . predicate: Um Predicate que define a condição que os elementos devem satisfazer para serem incluídos no novo stream.
		 * 
		 * Descrição
		 * 
		 * . takeWhile() continua a coletar elementos do stream original enquanto o predicado retornar true.
		 * 
		 * . Assim que o predicado retornar false para um elemento, a operação para, e nenhum elemento adicional é incluído no novo stream.
		 * 
		 * . A operação é sensível à ordem dos elementos, portanto, é garantido que todos os elementos anteriores ao primeiro que não atende à condição serão incluídos no resultado.
		 * 
		 */
		
		alunos.stream()
		      .distinct()
		      .skip(2)
		      .takeWhile(a -> a.nota >= 7)
		      .forEach(System.out::println);
		
		/*
		 * Considerações
		 * 
		 * . Curto-Circuito: takeWhile() é uma operação de curto-circuito que para assim que a condição for falsa.
		 * 
		 * . Ordenação: A operação respeita a ordem dos elementos do stream.
		 * 
		 * . Eficiente para Streams Ordenados: takeWhile() é mais eficiente que filter() quando se trabalha com streams ordenados e é necessário tomar elementos até uma certa condição ser falsa. 
		 * 
		 */
		
	}

}
