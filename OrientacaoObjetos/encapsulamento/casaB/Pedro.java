package OrientacaoObjetos.encapsulamento.casaB;

import OrientacaoObjetos.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	/* A classe Pedro consegue acessar os niveis protected e public da Classe Ana.
	 * Mas não consegue acessar os niveis private e default da classe Ana */
	
void testeAcessos() {
		
		// System.out.println(segredo);
		// System.out.println(facoDentroDeCasa);
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
		System.out.println(new Ana().todosSabem);
	
	}

}
