package Classe.Desafio;

public class DataTeste2 {
	
	public static void main(String[] args) {
		
		Data2 d1 = new Data2();
		//d1.dia = 01;
		//d1.mes = 01;
		//d1.ano = 2023;
		
		var d2 = new Data2(11, 11, 1998);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
		
	}

}
