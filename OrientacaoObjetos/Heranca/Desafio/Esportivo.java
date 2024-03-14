package OrientacaoObjetos.Heranca.Desafio;

/* Uma interface é um tipo de referência que pode conter apenas constantes, métodos abstratos, métodos default e métodos estáticos.
 * Ela é usada para especificar um conjunto de métodos que uma classe deve implementar.
 * As interfaces são utilizadas para alcançar a abstração e fornecer um contrato para as classes que a implementam. */

public interface Esportivo {
	
	void ligarTubo();
	void desligarTubo();
	
	/* Alguns pontos importantes sobre interfaces em Java:
	 * 
	 * 1 - Todos os métodos em uma interface são implicitamente públicos e abstratos, a menos que sejam declarados como métodos default ou estáticos.
	 * 
	 * 2 - As variáveis em uma interface são implicitamente públicas, estáticas e finais. 
	 * 
	 * 3 - Uma classe pode implementar várias interfaces, separadas por vírgulas, mas só pode estender uma única classe. 
	 * 
	 * 4 - Uma classe que implementa uma interface deve fornecer implementações para todos os métodos abstratos definidos na interface, a menos que a classe seja abstrata.
	 * 
	 * 5 - A partir do Java 8, interfaces podem ter métodos default, que fornecem implementação padrão para métodos em interfaces.
	 * 
	 * 6 - A partir do Java 8, interfaces podem ter métodos estáticos, que são métodos associados à interface em si, e não às instâncias de classes que a implementam.
	 */
	

}
