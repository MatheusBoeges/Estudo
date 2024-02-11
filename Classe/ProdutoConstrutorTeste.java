package Classe;

public class ProdutoConstrutorTeste {
	
	public static void main(String[] args) {
		
		ProdutoConstrutor p1 = new ProdutoConstrutor("Notebook", 4356.89, 0.25);
		
		var p2 = new ProdutoConstrutor();
		p2.nome = "Caneta preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
		
	}
	
	

}
