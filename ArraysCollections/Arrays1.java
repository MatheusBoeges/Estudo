package ArraysCollections;

import java.util.Arrays;

/* Um array é uma estrutura de dados que armazena uma coleção de elementos do mesmo tipo, acessíveis por um índice.
 * Ele fornece um meio conveniente de armazenar um conjunto de valores do mesmo tipo em uma única variável. */

public class Arrays1 {
	
	public static void main(String[] args) {
		
		/* A declaração de um array em Java envolve especificar o tipo de elementos que o array conterá,
		 * seguido pelo nome da variável e o uso de colchetes para indicar que se trata de um array.[] */
		
		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));
		
		// Os elementos do array são acessados usando seus índices, que começam do zero.
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]);
		
		// Em Java, o tamanho de um array é fixo após a inicialização e pode ser obtido usando a propriedade .length
		System.out.println(notasAlunoA[notasAlunoA.length - 1]);
		
		//	System.out.println(notasAlunoA[4]); ERRO!
		
		double totalAlunoA = 0;
		
		// O acesso a todos os elementos de um array é frequentemente feito usando loops, como o loop :for
		for(int i = 0; i <notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		final double notaArmazenada = 5.9;
		double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
		
		/* Os arrays em Java são muito úteis para armazenar coleções de elementos do mesmo tipo de forma eficiente,
		 * permitindo o acesso aos elementos por meio de índices e facilitando a manipulação de conjuntos de dados. */
		
	}

}
