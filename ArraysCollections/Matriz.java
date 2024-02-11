package ArraysCollections;

/* Uma matriz é uma estrutura de dados multidimensional que armazena elementos em linhas e colunas.
 * Em essência, é um array de arrays, permitindo a organização de dados em uma estrutura bidimensional. */


import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos alunos? ");
		int qtdeAlunos = entrada.nextInt();
		
		System.out.print("Quantas notas por aluno? ");
		int qtdeNotas = entrada.nextInt();
		
		// Para declarar uma matriz em Java, você usa colchetes adicionais para especificar as dimensões.
		
		double[][] notasDaTurma = new double[qtdeAlunos] [qtdeNotas];
		
		/* Os elementos de uma matriz são acessados utilizando índices para especificar a posição do elemento na matriz.
		 * O tamanho de cada dimensão de uma matriz pode ser obtido utilizando o atributo length. */
		
		// Você pode iterar sobre os elementos de uma matriz utilizando loops aninhados.
		
		double total = 0;
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
				notasDaTurma[a][n] = entrada.nextDouble();
				total += notasDaTurma[a][n];
			}
		}
		
		double media = total / (qtdeAlunos * qtdeNotas);
		System.out.println("Média da turma é " + media);
		
		for (double[] notasDoAluno: notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		/* As matrizes em Java permitem a representação eficiente de dados bidimensionais,
		 * são amplamente utilizadas para armazenar e manipular conjuntos de dados organizados em linhas e colunas. */
		
		entrada.close();
		
	}

}
