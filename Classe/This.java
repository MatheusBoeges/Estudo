package Classe;

/* this é uma referência especial que se refere ao objeto atual no contexto em que está sendo usada. Ela representa a instância atual da classe na qual é utilizada.
 * Essa referência é extremamente útil para evitar ambiguidades entre variáveis locais e membros da classe, 
 * bem como para acessar construtores, métodos e campos da própria instância. */

public class This {
	
	int dia;
	int mes;
	int ano;
	
	This() {
		// dia = 1;
		// mes = 1;
		// ano = 1970;
		this(1, 1, 1970);
	}
	
	
	/* Dentro de uma classe, especialmente em métodos,
	 * quando existe um nome de variável local que é o mesmo que o nome de uma variável de instância da classe,
	 * this é usado para diferenciar e acessar a variável de instância. */
	
	This(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	
	String obterDataFormatada() {
		final String formato = "%d/%d/%d";
		return String.format( formato, this.dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}

}
