package Classe;

	// Um construtor é um tipo especial de método que é invocado quando um objeto é criado usando a palavra-chave new.

public class ProdutoConstrutor {
	
	String nome;
	double preco;
	double desconto;
	
	/* O construtor é usado para inicializar o estado de um objeto, ou seja, para atribuir valores iniciais aos atributos da classe quando o objeto é instanciado.
	 * 	Aqui está a estrutura básica de um construtor em Java:
	 */
	
	ProdutoConstrutor(String nomeInicial, double precoInicial, double descontoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	
	ProdutoConstrutor() {
		
	}
	
	/* 1 - O nome do construtor é o mesmo que o nome da classe.
	 * 2 -  Um construtor não possui um tipo de retorno, nem mesmo void.
	 * 3 - Um construtor pode ou não receber parâmetros.
	 * 4 - Se você não fornecer um construtor explicitamente para sua classe, Java fornecerá um construtor padrão (sem parâmetros) automaticamente.
	 * 5 - A palavra-chave this é usada dentro de um construtor para se referir ao próprio objeto sendo construído.
	 */ 
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}

}
