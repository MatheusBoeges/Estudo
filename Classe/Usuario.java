package Classe;

/* Em Java, os métodos equals() e hashCode() são fundamentais ao trabalhar com objetos que podem ser armazenados em coleções baseadas em hash,
 * como HashMap, HashSet, Hashtable, etc. */

import java.util.Objects;

public class Usuario {
	
	String nome;
	String email;
	
	/* Método hashCode():
	 * 
	 * Objetivo: O método hashCode() é usado para obter um valor numérico (código hash) representativo do conteúdo do objeto.
	 * Esse valor é frequentemente utilizado por coleções baseadas em hash para melhorar o desempenho em operações de busca e inserção.
	 * 
	 * 
	 * Implementação Padrão: Na implementação padrão da classe Object, o método hashCode() geralmente retorna o endereço de memória do objeto convertido para um valor inteiro.
	 * No entanto, muitas classes substituem esse método para gerar um código hash significativo com base no conteúdo dos objetos.
	 * 
	 */
	
	@Override
	public int hashCode() {
		return Objects.hash(email, nome);
	}
	
	/* Método equals():
	 * 
	 * Objetivo: O método equals() é usado para comparar se dois objetos são iguais em termos de conteúdo.
	 * Ele é frequentemente sobrescrito nas classes para fornecer uma lógica de comparação personalizada.
	 * 
	 * 
	 * Implementação Padrão: Na implementação padrão da classe Object, o método equals() compara a referência dos objetos (ou seja, verifica se são a mesma instância).
	 * Entretanto, muitas classes substituem esse método para comparar o conteúdo dos objetos.
	 * 
	 */
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(email, other.email) && Objects.equals(nome, other.nome);
	}
	
	/* Relacionamento entre equals() e hashCode():
	 * 
	 * . Se dois objetos são iguais (equals() retorna true), seus códigos hash (hashCode()) devem ser iguais.
	 * 
	 * 
	 * . Se dois objetos têm o mesmo código hash, eles podem ou não ser iguais. Nesse caso, o método equals() deve ser chamado para verificar a igualdade real.
	 * 
	 */
	
}