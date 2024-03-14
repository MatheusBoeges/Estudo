package OrientacaoObjetos.encapsulamento;

/* Os métodos "getters" e "setters" são métodos especiais usados para acessar (get) e modificar (set) os valores dos atributos de uma classe.
 * Eles são parte importante do encapsulamento em programação orientada a objetos,
 * permitindo o acesso controlado aos atributos de uma classe e protegendo esses atributos de acesso direto de outras classes. */

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private int idade;
	
	public Pessoa(String nome, String sobrenome, int idade) {
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
	}
	
	/* Getter (método de acesso):
	 * 
	 * 1 - Um método "getter" é usado para recuperar o valor de um atributo de uma classe.
	 *  
	 * 2 - Geralmente, um getter é nomeado seguindo o padrão getNomeDoAtributo(), onde NomeDoAtributo é o nome do atributo que desejamos recuperar.
	 * 
	 */
	
	public String getNome() {
		return nome;
	}
	
	/* Setter (método de modificação):
	 * 
	 * 1 - Um método "setter" é usado para modificar o valor de um atributo de uma classe.
	 * 
	 * 2 - Geralmente, um setter é nomeado seguindo o padrão setNomeDoAtributo(Tipo parametro),
	 * onde NomeDoAtributo é o nome do atributo que desejamos modificar e Tipo é o tipo de dado do atributo.
	 * 
	 */

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}
	
	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int novaIdade) {
		
		novaIdade = Math.abs(novaIdade);
		
		if(novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;	
		}
		
	}
	
	@Override
	public String toString() {
		return "Olá eu sou o " + getNome() + " e tenho " + getIdade() + " anos.";
	}
	
	/* O uso de getters e setters proporciona controle sobre como os atributos de uma classe são acessados e modificados.
	 * Isso é útil para garantir a integridade dos dados, validar os valores atribuídos aos atributos e possibilitar mudanças internas na implementação da classe sem afetar o código que a utiliza.
	 * Além disso, os getters e setters são frequentemente utilizados em frameworks de mapeamento objeto-relacional (ORM) e em tecnologias como JavaBeans.
	 */
	
}
