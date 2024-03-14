package OrientacaoObjetos.Heranca.teste;

import OrientacaoObjetos.Heranca.Direcao;
import OrientacaoObjetos.Heranca.Heroi;
import OrientacaoObjetos.Heranca.Jogador;
import OrientacaoObjetos.Heranca.Monstro;

public class Jogo {
	
	public static void main(String[] args) {
		
		Jogador j1 = new Monstro();
		
		j1.x = 10;
		j1.y = 10;
		
		System.out.println("Monstro life: " + j1.life + "\n");
		
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.LESTE);
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.LESTE);
		
		System.out.println(j1.x);
		System.out.println(j1.y);
		
		// Usando o construtor criado na classe Heroi.
		
		Jogador j2 = new Heroi(12, 9);
		
		//j2.x = 12;
		//j2.y = 9;
		
		System.out.println("\nHeroi life: " + j2.life + "\n");
		
		j1.atacar(j2);
		j2.atacar(j1);
		
		System.out.println("Monstro Life: " + j1.life);
		System.out.println("heroi Life: " + j2.life);
		
		
	}

}
