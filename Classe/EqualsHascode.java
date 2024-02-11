package Classe;

import java.util.Date;

public class EqualsHascode {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Matheus";
		u1.email = "Matheus.b@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Matheus";
		u2.email = "Matheus.b@gmail.com";
		
		// == Comparando endereço de memoria.
		// equals Compara os atributos dos objetos para verificar se são iguais. Mas apenas se fizemos uma implementação no equals se não fica a mesma coisa de fazer ==.
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		System.out.println(u2.equals(new Date()));
		
		
	}
	
}
