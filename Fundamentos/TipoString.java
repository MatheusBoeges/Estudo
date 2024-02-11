package Fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		//string é um conjunto de caracteres.
		
		System.out.println("Olá pessoal".charAt(2)); // Retorna a letra no índice escolhido.
				
		String s = "Boa tarde";
						
		System.out.println(s.concat("!!!"));
		System.out.println(s.startsWith("Boa")); // Retorna se a Sting começa com o valor digitado true ou false
		System.out.println(s.toLowerCase().startsWith("Boa")); // Deixa as letras minúsculas.
		System.out.println(s.endsWith("tarde!")); // Retorna se a Sting termina com o valor digitado true ou false
		System.out.println(s.length()); // Retorna quantos caracteres tem uma String.
		System.out.println(s.equals("boa tarde")); // Compara se o valor digitado é igual a String
		System.out.println(s.equalsIgnoreCase("boa tarde")); // retorna o mesmo resultado porem ele ignora se a Sting está com letras maiúscula ou minúscula
		s = s.toUpperCase(); // Deixa as letras maiúsculas.

				
		var nome = "Matheus";
		var sobrenome = "Borges";
		var idade = 24;
		var salario = 2000.00;
				
		// System.out.printf e um print formatado = %s e para valor Sting, %d e para valor int, $f e para valor double, %.2f arredonda quantas casas decimais você quer.
				
		System.out.printf("O senhor %s %s tem %d anos e ganha R&%.2f.", nome, sobrenome, idade, salario);
		
	}

}
