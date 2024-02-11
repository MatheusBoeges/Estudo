package EstruturasDeControle.Desafio;

public class DesafioIf {
	
	public static void main(String[] args) {
		
		
		double nota = 1.3;
		
		if(nota >= 9.0)
			
			;
		
		{
			System.out.println("Quadro de Honra!");
			System.out.println("Você é fera!!!");
		}
		
		/* Por causa do ponto e virgula ele considera a expressão falsa e vai gerar a proxima coisa que vir,
		 *  seja uma setença de código ou um bloco de código ele será executado de forma condicional */
		
		
		double nota1 = 1.3;
		
		// não usar ; em estrutura de controle (tem uma exceção)
		
		if(nota1 >= 9.0) {
			System.out.println("Quadro de Honra!");
			System.out.println("Você é fera!!!");
		}

	}

}
