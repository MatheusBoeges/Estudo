package Classe.Desafio;

public class Data2 {
	
	// Criar um classe Data e Data Teste
	
	int dia;
	int mes;
	int ano;
	
	Data2() {
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	
	Data2(int diaInicial, int mesInicial, int anoInicial) {
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
	
	// tambem é valida
	
	/*String obterDataFormatada () {
	 * 	return Integer.toString(dia) + "/" + Integer.toOctalString(mes) + "/" + Integer.toString(ano) ;
	 * }
	 */
	

}
