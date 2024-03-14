package OrientacaoObjetos.Composicao.Desafio;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		// Especificando que o carro tem 4 portas.
		
		Carro c1 = new Carro(4);
		
		System.out.println(c1.estaLigado());
		
		c1.ligar();
		
		System.out.println(c1.estaLigado());
		
		System.out.println(c1.motor.giros());
		
		// Verefica se as portas estão fechadas antes de acelerar.
		
		if(c1.portasFechadas()) {
			c1.acelerar();
			c1.acelerar();
			c1.acelerar();
			c1.acelerar();
		} else {
			System.out.println("Não é possivel acelerar. Portas aberta");
		}
	
		System.out.println(c1.motor.giros());
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();

		System.out.println(c1.motor.giros());
		
		
		
		
		
		
		
		
		
		
	}

}
