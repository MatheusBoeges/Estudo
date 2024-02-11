package Fundamentos;

import java.util.Scanner;

public class StingEquals {
	
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.nextLine();
		System.out.println("2" == s2.trim()); // Para remover espações em brancos, digitados pelo o usúario utilizamos o trim.
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
		
	}

}
