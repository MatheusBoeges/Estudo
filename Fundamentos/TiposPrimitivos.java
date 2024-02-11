package Fundamentos;

public class TiposPrimitivos {
	
	// Informações de um funcionario
	
		public static void main(String[] args) {
		
			// Tipos númericos inteiros
			
			byte anosDeEmpresa = 23;
			short numeroDeVoos = 542;
			int id = 56789; // é o mais utilizado, quando ouver erro é porque o numero armazenado é maior do que a capacidade da variavel.
			long pontosAcumulados = 3_234_845_223L; // O _ é usado para separar os valores e quando passoa da capacidade do número inteiro utilizamos o L no final do numero recebido.
							
			// Tipos númericos reais (ponto flutuante)
							
			float salario = 11_445.44F;
			double vendasAcumuladas = 2_991_797_103.01;
							
			// Tipos booleano
							
			boolean estaDeFerias = false; // true → são apenas este dois valores.
							
			// Tipos caractere
							
			char status = 'A'; // ativo → 
							
			// Dias de empresa
			System.out.println(anosDeEmpresa * 365);

			// Número de viagens
			System.out.println(numeroDeVoos / 2);
							
			// Pontos por real
			System.out.println(pontosAcumulados / vendasAcumuladas);
							
			System.out.println(id + ": ganha R$:" + salario);
			System.out.println("Ferias? " + estaDeFerias);
			System.out.println("Status: " + status);	
			
		}
}
