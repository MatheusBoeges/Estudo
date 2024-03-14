package OrientacaoObjetos.Abstrato;

// Para usar uma classe abstrata, você deve estender a classe e fornecer implementações para todos os métodos abstratos que ela contém. Veja um exemplo de uma classe que estende 

public class Cachorro extends Mamifero {
	
	/* Neste exemplo, Cachorro é uma subclasse de Animal e fornece uma implementação para o método abstrato mover().
	 * Agora, você pode criar objetos da classe Cachorro, mas não pode criar objetos diretamente da classe Animal, pois ela é abstrata.
	 */
	
	@Override
	public String mover() {
		// TODO Auto-generated method stub
		return super.mover();
	}
	
	@Override
	public String mamar() {
		return "Usando leite";
	}
	
	/* As classes abstratas são úteis para definir comportamentos padrão e fornecer um esqueleto para outras classes.
	 * Elas promovem a reutilização de código e a extensibilidade do design orientado a objetos.
	 * 	 */

}
