package Classe;

/* null é um valor especial que pode ser atribuído a variáveis de tipos de referência (objetos).
 * Ele indica a ausência de um objeto, ou seja, que a variável não está apontando para nenhum objeto na memória. */

public class ValorNulo {
	
	public static void main(String[] args) {
		
		/* 1 - Uso com Tipos de Referência: null é usado para indicar que uma variável de referência não está apontando para nenhum objeto válido na memória.
		 * 
		 * 2 - Inicialização Padrão: Para variáveis de referência (como objetos), se você não atribuir um valor inicial a elas,
		 * o Java automaticamente define o valor padrão como null.
		 * 
		 * 3 - Acesso a Variáveis Não Inicializadas: Tentar acessar variáveis de referência que ainda não foram inicializadas (ou seja, não receberam um objeto válido)
		 * resultará em um erro de tempo de execução chamado NullPointerException.
		 */
		
		
		String s1 = "";
		System.out.println(s1.concat("!!!!"));
		
		This d1 = Math.random() > 0.5 ? new This() : null;
		
		// Você não pode acessar nem atribuito, nem método de algo que está nulo. Que não aponta para um objeto real na memória.
		
		if(d1 != null) {
			d1.mes = 3;
			System.out.println(d1.obterDataFormatada());
		}
		
		String s2 = Math.random() > 0.5 ? "Opa" : null;
		
		if (s2 != null) {
			System.out.println(s2.concat("????"));
		}
		
	}

}
