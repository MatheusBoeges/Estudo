package OrientacaoObjetos.Composicao;

/* Um relacionamento de um para muitos unidirecional é uma associação entre duas classes,
 * onde uma instância de uma classe está associada a zero ou mais instâncias de outra classe, mas não há uma associação direta inversa.
 * Ou seja, uma classe tem conhecimento da outra, mas a outra classe não sabe sobre a primeira. */

import java.util.ArrayList;

public class Compra1 {
	
	String cliente;
	ArrayList<ItemUnidirecional> itens = new ArrayList<ItemUnidirecional>();
	
	double obterValorTotal() {
		double total = 0;
		
		for(ItemUnidirecional itemUnidirecional: itens) {
			total += itemUnidirecional.quantidade * itemUnidirecional.preco; 
		}
		
		return total;
	}

}
