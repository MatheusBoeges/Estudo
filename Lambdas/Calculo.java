package Lambdas;

/* 
 * FunctionalInterface é uma interface introduzida no Java 8 que serve como um marcador para indicar que uma interface tem apenas um único método abstrato,
 * chamado de "método funcional" ou "método abstrato funcional".
 * Essas interfaces são projetadas para serem usadas em contextos onde a funcionalidade de uma única função é necessária, como expressões lambda ou referências de método.
 *
 * */

@FunctionalInterface
public interface Calculo {
	
	// As expressões lambda são frequentemente usadas em conjunto com interfaces funcionais, que são interfaces que contêm apenas um método abstrato.
	
	double executar (double a, double b);
	
	/* 
	 * A anotação @FunctionalInterface não é obrigatória, mas é uma convenção recomendada para deixar claro que uma interface é funcional.
	 * Se uma interface anotada com @FunctionalInterface tiver mais de um método abstrato, o compilador gerará um erro.
	 * 
	 */

	default String legal() {
		return "Legal";
	}

	static String muitoLegal() {
		return "Muito legal";
	}

}
