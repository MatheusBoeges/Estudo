package OrientacaoObjetos.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Matheus", "Borges", 25);
		
		p1.setIdade(230); // Alterarando o valor de uma variavel private
		
		System.out.println(p1.getIdade()); // Lendo o valor de uma variavel private
		System.out.println(p1); // toString
		System.out.println(p1.getNomeCompleto());
		
		
		
		
		
		
	}

}
