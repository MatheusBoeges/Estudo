package OrientacaoObjetos.Abstrato;

/* Uma classe abstrata é uma classe que não pode ser instanciada diretamente, ou seja, você não pode criar um objeto diretamente a partir dela.
 * Ela é projetada para ser uma classe base para outras classes,
 * fornecendo implementações padrão para métodos ou definindo métodos abstratos que devem ser implementados pelas classes filhas.
 */

public abstract class Animal {
	
	public String respirar() {
		return "Usando Oxigênio";
	}
	
	public abstract String mover();

	/* Neste exemplo, Animal é uma classe abstrata que define um método abstrato mover().
	 * Qualquer classe que estenda Animal deve fornecer uma implementação para o método fazerBarulho(), mas pode usar a implementação padrão do método respirar().
	 * Observe que a classe Animal não pode ser instanciada diretamente.
	 */
	
}
