package OrientacaoObjetos.Composicao;

/* Uma relação de um para um unidirecional é uma associação entre duas classes,
 * onde uma instância de uma classe está associada a exatamente uma instância de outra classe e vice-versa não é garantida.
 * No caso unidirecional, apenas uma das classes conhece a outra. */

public class MotorUnidirecional {
	
	boolean ligado = false;
	
	double fatorInjecao = 1;
	
	int giros() {
		if(!ligado) {
			return 0;
		} else {
			return (int) Math.round(fatorInjecao * 3000);
		}
	}
	
	
}
