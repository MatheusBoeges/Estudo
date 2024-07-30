package Classe.Desafio;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto1 p1 = new Produto1("Notebook", 4356.89);
		
		var p2 = new Produto1();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		
		Produto1.desconto = 0.50;
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
		
	}

}
