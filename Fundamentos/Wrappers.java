package Fundamentos;

public class Wrappers {
	
	public static void main(String[] args) {
		
		/*  "wrapper classes" são classes que fornecem uma forma de encapsular ou "embrulhar" tipos primitivos, como int, double, char, etc., em objetos.
		 * Essas classes são usadas para converter tipos primitivos em objetos e são frequentemente usadas em programação, 
		 * especialmente quando se trabalha com coleções ou classes genéricas. */
		
		// byte
		
		Byte b =100;
		Short s = 1000;
		
		// Integer.parseInt("10000"); → Transforma um tipo String em valor int.
		Integer i = 10000; // Seria o int.
		Long l = 10000L; // Diferente dos outros o  long só converte para long.
		
		System.out.println(b.byteValue()); // Traz o valor da classe b.
		System.out.println(s.toString()); // Transforma o valor int  para o tipo String.
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f =123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		 
		Boolean bo = Boolean.parseBoolean("true"); // Converte um tipo String para um valor boolean.
		System.out.println(bo);
		System.out.println(bo.toString()); // Converte um valor boolean para um tipo String.
		
		Character c = '#'; // Seria o char.
		System.out.println(c + "...");
		
	}

}
