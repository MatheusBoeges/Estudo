package OrientacaoObjetos.encapsulamento.casaB;

import OrientacaoObjetos.encapsulamento.casaA.Ana;

public class Julia {
	
	/* A classe Julia consegue acessar apenas o nivel public da Classe Ana.
	 * Mas não consegue acessar os niveis private, default e protected da classe Ana */
	
	void testeAcessos() {
		
		Ana sogra = new Ana();
		
		// System.out.println(sogra.segredo);
		// System.out.println(sogra.facoDentroDeCasa);
		// System.out.println(sogra.formaDeFalar);
		System.out.println(sogra.todosSabem);
	
	}

}
