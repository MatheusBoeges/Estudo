package OrientacaoObjetos.Composicao;

public class Carro2 {
	
	final MotorBidirecional motor;
	
	Carro2() {
		this.motor = new MotorBidirecional(this);
	}
	
	void acelerar() {
		if(motor.fatorInjecao < 2.6) {
			motor.fatorInjecao += 0.4;
		}
	}

	void frear() {
		if(motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
		}
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado; 
	}

}
