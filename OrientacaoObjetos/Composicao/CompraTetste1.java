package OrientacaoObjetos.Composicao;

public class CompraTetste1 {
	
	public static void main(String[] args) {
		
		Compra1 compra1 = new Compra1();
		
		compra1.cliente = "João Pedro";
		compra1.itens.add(new ItemUnidirecional("Caneta", 20, 7.45));
		compra1.itens.add(new ItemUnidirecional("Borracha", 12, 3.89));
		compra1.itens.add(new ItemUnidirecional("Caderno", 3, 18.79));
		
		System.out.println(compra1.itens.size());
		System.out.println("O valor total é : R$ " + compra1.obterValorTotal());
		
	}

}
