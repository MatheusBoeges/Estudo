package OrientacaoObjetos.encapsulamento.casaA;

public class Paulo {
	
	/* A classe Paulo consegue acessar os niveis default (padrão), protected e public da Classe Ana.
	 * Mas não consegue acessar o nivel private da classe Ana */
	
	void testeAcessos() {
		
		Ana esposa = new Ana();
		
		// System.out.println(esposa.segredo);
		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
	
	}

}
