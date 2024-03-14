package OrientacaoObjetos.Heranca;

public class Monstro extends Jogador {
	
	/* A classe Monstro perdeu a referencia com o construtor padrão da classe pai.
	 * Asiim precisando explicidamente chamar o construtor correto. */
	
	
	// Criando o construtor padrão
	
	public Monstro() {
		this(0,0);
	}
	
	public Monstro(int x, int y) {
		super(x, y);
	}
	
	// Rescrever um comportamento (metodo) da super classe
	
	public boolean atacar (Jogador oponente) {
		
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.life -= 15;
			return true;
		} else if(deltaX == 1 && deltaY == 0) {
			oponente.life -= 15;
			return true;
		} else {
			return false;
		}
		
	}

}
