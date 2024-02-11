package Fundamentos;

public class OperadoresAtribuicao {
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
	
		c += b; // c = c + b;
		c -= a; // c = c - a;
		c *= b; // c = c * b;
		c /= a; // c = c / a;
		
		System.out.println(c);
		
		// O módulo ou operador de módulo retorna o restante dos dois inteiros após a divisão. Sendo 0 par e 1 impar
		
		c %= 2; // c = c % 2;
		
		System.out.println(c);
		
	}

}
