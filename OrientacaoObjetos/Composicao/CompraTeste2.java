package OrientacaoObjetos.Composicao;

public class CompraTeste2 {
	
	public static void main(String[] args) {
		
		Compra2 compra1 = new Compra2();
		
		compra1.cliente = "João Pedro";
		compra1.adicionarItem("Caneta", 20, 7.45);
		compra1.adicionarItem("Borracha", 12, 3.89);
		compra1.adicionarItem("Caderno", 3, 18.79);
		
		System.out.println(compra1.itens.size());
		System.out.println("O valor total é : R$ " + compra1.obterValorTotal());
		
		double total = compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
		
		System.out.println("O total é " + total);
		
	}
			
}
