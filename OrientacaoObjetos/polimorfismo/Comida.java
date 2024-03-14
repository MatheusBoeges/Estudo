package OrientacaoObjetos.polimorfismo;

// O polimorfismo de subtipo refere-se à capacidade de uma variável de referência de uma superclasse ser referenciada por objetos de suas subclasses.

public class Comida {
	
	private double  peso;
	
	public Comida(double peso) {
		setPeso(peso);
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		
		if(peso >= 0) {
			this.peso = peso;
		}
		
	}

	/* Neste exemplo, tanto Arroz, Feijão e Sorvete são subclasses de Comida.
	 * O método peso() é sobrescrito em cada uma das subclasses e é chamado de forma polimórfica a partir das referências comida1 e comida2. */
	
}
