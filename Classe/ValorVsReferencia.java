package Classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		/* Quando se trata de tipos primitivos, como int, float, double, boolean, etc., a atribuição ocorre por valor.
		 * Isso significa que o valor real da variável é copiado para outra variável, e as alterações feitas em uma variável não afetam a outra. */
		
		double a = 2;
		double b = a; // Atribuição por valor (Tipo primitivo)
		
		a++;
		b--;
		
		System.out.println(a + " " + b + "\n");
		
		/* Quando se trata de objetos (instâncias de classes), a atribuição ocorre por referência. Nesse caso, uma referência ao objeto é copiada para a variável, não o objeto em si.
		 * Isso significa que ambas as variáveis referenciam o mesmo objeto na memória, portanto, alterações feitas em um objeto serão refletidas em todas as referências a esse objeto. */
		
		
		
		This d1 = new This(1, 6, 2022);
		This d2 = d1;  // atribuição por referência (Objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada() + "\n");
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada() + "\n");
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}
	
	static void voltarDataParaValorPadrao(This d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}
	
}
