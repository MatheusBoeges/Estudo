package Fundamentos;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		
		System.out.println("Tabela verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
		// System.out.println(false && true);
		// System.out.println(false && false);
		
		System.out.println("\nTabela verdade OU (OR)");
		//System.out.println(true || true);
		//System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nTabela verdade OU EXCLUSIVO (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\nTabela verdade NEGAÇÃO (NOT)");
		System.out.println(!true);
		System.out.println(!false);
		
	}

}
