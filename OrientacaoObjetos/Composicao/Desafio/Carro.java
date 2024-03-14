package OrientacaoObjetos.Composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Carro {
	
	Motor motor = new Motor();
	
	List<Portas> portas = new ArrayList<Portas>();
	
	// Construtor  para especificar o número de portas ao criar o carro.
	
	Carro(int numeroDePortas) {
		this.portas = new ArrayList<Portas>();
		for (int i = 0; i < numeroDePortas; i++) {
			this.portas.add(new Portas());
		}
	}
	
	// Verifica se todas as portas estão fechadas.
	
	boolean portasFechadas() {
		for (Portas portas : portas) {
			if(!portas.estaFechada()) {
				return false;
			}
		}
		return true;
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
		if(portasFechadas()) {
			motor.ligado = true;
		} else {
			System.out.println("Não e possivel acelerar. Carro desligado");
		}	
	}

	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
	
}
