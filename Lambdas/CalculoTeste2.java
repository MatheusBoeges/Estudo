package Lambdas;

/* As expressões lambda são uma funcionalidade introduzida no Java 8 que permite tratar funções como entidades de dados.
 * Elas são uma forma concisa de representar uma função anônima que pode ser passada como argumento para métodos ou atribuída a variáveis.
 */

public class CalculoTeste2 {
	
	// Aqui está um exemplo simples de uma expressão lambda que recebe dois double e retorna sua soma:
	
	public static void main(String[] args) {
		
		Calculo calc = (x, y ) -> {	return x + y; };
		System.out.println(calc.executar(2, 3));
		
		calc = (x, y) -> x * y;
		System.out.println(calc.executar(2, 3));
	
		System.out.println(calc.legal());
		System.out.println(Calculo.muitoLegal());
		
	}
	
	/* 
	 * As expressões lambda tornam o código mais conciso e legível,
	 * especialmente quando se trata de operações em coleções (usando métodos como map, filter, reduce, etc.)e em programação assíncrona (usando callbacks e streams).
	 * Elas são uma adição poderosa à linguagem Java, permitindo um estilo de programação mais funcional e expressivo.
	 * 
	 */
	
}
