package Fundamentos;

public class OperadoresUnarios {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		// Forma pós fixada.
		
		a++; // a = a + 1;
		a--; // a = a - 1;
		
		// Forma pré fixada.
		
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		System.out.println("Mini desafio.");
		System.out.println(++a == b--);
		
	}

}
