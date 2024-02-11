package Fundamentos;

public class OperadoresRelacionais {
	
	public static void main(String[] args) {
		
		int a = 97;
		int b = a;
		
		System.out.println(a == b); //O sinal de comparação é ==
		
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(30 <= 7);
		System.out.println(30 != 7); // O sinal de difrente é !
		
		// Fica ao seu criterio em criar um variavel ou colocar direto na expressão.
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7.0;
		boolean temDesconto = bomComportamento && passouPorMedia;
	
		System.out.println("Tem desconto? " + temDesconto);
		
	}

}
