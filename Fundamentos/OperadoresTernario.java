package Fundamentos;

public class OperadoresTernario {
	
	public static void main(String[] args) {
		
		double media = 7.6;
		
		// começa com uma expressão que utiliza o simbolo de ?  que traz um valor true or false que é separado pelo simbolo :
		
		String resultadoParcial = media >= 5.0 ? "em recuperação" : "reprovado";
		String resultadoFinal = media >= 7.6 ? "aprovado" : resultadoParcial;
		
		/* ou podemos utilizar a seguinte expressão:
		 * String resultadoFinal = media >= 7.6 ? "aprovado" : media >= 5.0 ? "em recuperação" : "reprovado";  */
		
		System.out.println("O aluno está " + resultadoFinal);
		
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7.0;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Não.";
	
		System.out.println("Tem desconto? " + resultado);
		
	}

}
