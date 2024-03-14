package OrientacaoObjetos.Composicao;

/* Um relacionamento de um para muitos bidirecional é uma associação entre duas classes,
 * onde uma instância de uma classe está associada a zero ou mais instâncias de outra classe,
 * e as instâncias da outra classe podem estar associadas de volta à primeira classe. */

import java.util.ArrayList;

public class Compra2 {
	
	String cliente;
	ArrayList<ItemBidirecional> itens = new ArrayList<ItemBidirecional>();
	
	void adicionarItem (String nome, int quantidade, double preco) {
		this.adicionarItem(new ItemBidirecional(nome, quantidade, preco));
	}
	
	void adicionarItem (ItemBidirecional itemBidirecional) {
		this.itens.add(itemBidirecional);
		itemBidirecional.compra =this;
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(ItemBidirecional itemBidirecional: itens) {
			total += itemBidirecional.quantidade * itemBidirecional.preco; 
		}
		
		return total;
	}

}
