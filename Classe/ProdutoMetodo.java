package Classe;

public class ProdutoMetodo {
	
	/* Um método é um bloco de código que define um comportamento específico associado a um objeto ou a uma classe.
	 * Métodos são utilizados para realizar operações, executar ações ou fornecer funcionalidades específicas dentro de um programa. */
	
	String nome;
	double preco;
	double desconto;
	
	// Aqui está a estrutura básica de um método em Java:
	
	// Parâmetros: São variáveis usadas em métodos para receber dados. Exemplo de parâmetro em um método:
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}

	/* 1 - modificadorAcesso: Define o nível de acesso do método (por exemplo, public, private, protected ou default).
	 * 2 - tipoRetorno: É o tipo de dado que o método retorna. Se o método não retornar nenhum valor, o tipo de retorno é void.
	 * 3 - nomeDoMetodo: É o nome dado ao método.
	 * 4 - parâmetros: São valores que o método pode receber como entrada. Eles são opcionais e separados por vírgulas. Se não houver parâmetros, os parênteses vazios são usados ().
	 * 5 - return: É utilizado para retornar um valor do método. Nem todos os métodos têm um return. Em métodos com retorno void, o return pode ser usado para encerrar o método.
	 */
	
	
}
