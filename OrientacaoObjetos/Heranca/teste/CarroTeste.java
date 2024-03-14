package OrientacaoObjetos.Heranca.teste;

import OrientacaoObjetos.Heranca.Desafio.Carro;
import OrientacaoObjetos.Heranca.Desafio.Ferrari;
import OrientacaoObjetos.Heranca.Desafio.Lamborghini;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Ferrari c1 = new Ferrari(400);
		
		System.out.println(c1);
		
		c1.ligarTubo();
		
		// Acelerar a ferrari
		
		c1.acelerar();
		System.out.println(c1);
		System.out.println(c1.velocidadeDoAr());
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		// Frea a ferrari
		
		c1.frear();
		System.out.println("\n" + c1);
		
		c1.frear();
		System.out.println(c1);
		
		c1.frear();
		System.out.println(c1);
		
		// Chamando o segundo carro
		
		Carro c2 = new Lamborghini();
		
		System.out.println("\n" + c2);
		
		c2.acelerar();
		c2.acelerar();
		
		System.out.println(c2);
		
		c2.frear();
		c2.frear();
		c2.frear();
		
		System.out.println(c2);
		
	}

}
