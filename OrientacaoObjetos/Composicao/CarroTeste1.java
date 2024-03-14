package OrientacaoObjetos.Composicao;

public class CarroTeste1 {
	
	public static void main(String[] args) {
	
		Carro1 c1 = new Carro1();
		
		System.out.println(c1.estaLigado());
		
		c1.ligar();
		
		System.out.println(c1.estaLigado());

		System.out.println(c1.motor.giros());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
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
