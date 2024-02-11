package Fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		
		double fator = 5.0 / 9.0;
		double ajuste = 32;
		
		double fahrenheit = 86; 
		double celsius = (fahrenheit - ajuste) * fator;
		
		System.out.println("A temperatura é: " + celsius + "ºC" );
		
	}

}
