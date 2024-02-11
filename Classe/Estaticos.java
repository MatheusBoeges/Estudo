package Classe;

public class Estaticos {
	
	/* Os membros de classe são associados à própria classe e não a instâncias específicas da classe.
	 * Eles são compartilhados por todos os objetos da classe e podem ser acessados diretamente usando o nome da classe, sem a necessidade de criar objetos. */
	
	double raio;
	
	// Variáveis estáticas: São variáveis associadas à classe em vez de objetos específicos e são compartilhadas por todas as instâncias da classe.
	
	final static double PI = 3.1415;
	
	Estaticos(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	
	/* Métodos Estáticos: São métodos que também pertencem à classe e podem ser chamados sem a necessidade de criar um objeto.
	 * Eles geralmente realizam tarefas relacionadas à classe e não operam em dados de instância. */
	
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}

}
