package OrientacaoObjetos.Composicao;

/* Uma relação de um para um bidirecional é uma associação entre duas classes onde,
 * cada instância de uma classe está associada exatamente a uma instância da outra classe, e vice-versa.
 * Ambas as classes têm referências umas para as outras. */

public class MotorBidirecional {
	
	final Carro2 carro ;
	
	boolean ligado = false;
	
	double fatorInjecao = 1;
	
	MotorBidirecional(Carro2 carro) {
		this.carro = carro;
	}
	
	
	int giros() {
		if(!ligado) {
			return 0;
		} else {
			return (int) Math.round(fatorInjecao * 3000);
		}
	}

}
