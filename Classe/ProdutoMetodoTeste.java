package Classe;

public class ProdutoMetodoTeste {
	
	public static void main(String[] args) {
		
		ProdutoMetodo p1 = new ProdutoMetodo();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		var p2 = new ProdutoMetodo();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		/* Para chamar um método, você precisa criar um objeto da classe correspondente (se o método não for estático) 
		 * e usar o nome do método seguido por parênteses, passando os argumentos necessários, se houver: */
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
		
		
		
	}
	
}
