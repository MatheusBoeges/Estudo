package Classe.Desafio;

public class Main {
	
	// Membro de instância
	
	int a = 3; // não pode mexer nessa linha
	
	// Ou transformar ela para static
	
	static int b = 4;
	
	
	public static void main(String[] args) {
		
		// Obrigado a criar uma instância
		Main p = new Main();
		
		System.out.println(p.a);
		
		System.out.println(b);
		
	}

}
