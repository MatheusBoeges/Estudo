package OrientacaoObjetos.Heranca;

/* A herança é um conceito fundamental na programação orientada a objetos que permite que uma classe (subclasse ou classe filha)
 * herde atributos e métodos de outra classe (superclasse ou classe pai). 
 * Isso significa que a subclasse pode reutilizar código da superclasse e estender seu comportamento, adicionando novos métodos e atributos ou sobrescrevendo métodos existentes. */

// Em Java, a herança é implementada usando a palavra-chave extends.

public class Heroi extends Jogador {
	
	/* Neste exemplo, a classe Heroi herda da classe Jogador. 
	 * Isso significa que a classe Heroi herda todos os atributos e métodos da classe Jogador,
	 * como andar e atacar. */
	
	public Heroi(int x, int y) {
		super(x, y);
	}
	
	// Outro modo de rescrever um comportamento (metodo da super classe
	
	public boolean atacar(Jogador oponente) {
		
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		
		return ataque1 || ataque2;
		 
	}
	
	// A herança permite a reutilização de código e promove a organização de classes de forma hierárquica, o que torna o código mais legível e mantível.

}
