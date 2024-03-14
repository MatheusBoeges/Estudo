package OrientacaoObjetos.Heranca;

public class Jogador {
	
	public int x;
	public int y;
	public int life = 100;
	
	// Construtor explicito
	
	protected Jogador(int x, int y) {
		this.x = x;
		this.y =y;
	}
	
	// Metodo de atacar outro Jogador
	
	public boolean atacar (Jogador oponente) {
		
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.life -= 10;
			return true;
		} else if(deltaX == 1 && deltaY == 0) {
			oponente.life -= 10;
			return true;
		} else {
			return false;
		}
		
	}
	
	// Metodo de andar no tabuleiro
	
	public boolean andar (Direcao direcao ) {
		
		switch (direcao) {
		
		case NORTE:
			y--;
			break;
		
		case LESTE:
			x++;
			break;
			
		case SUL:
			y++;
			break;
			
		case OESTE:
			x--;
			break;
		
		}
		
		return true;
	}

}
