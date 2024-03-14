package OrientacaoObjetos.Composicao;

public class ItemBidirecional {
	
	String nome;
	int quantidade;
	double preco;
	Compra2 compra;
	
	ItemBidirecional(String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}

}
