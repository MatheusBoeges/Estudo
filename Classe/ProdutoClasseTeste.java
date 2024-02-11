package Classe;

public class ProdutoClasseTeste {
	
	public static void main(String[] args) {
		
		/* Um objeto p1 da classe ProdutoClasse é criado usando o operador new. 
		 * Em seguida, são atribuídos valores às variáveis do objeto. */
		
		ProdutoClasse p1 = new ProdutoClasse();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		var p2 = new ProdutoClasse();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.preco * (1 - p1.desconto);
		double precoFinal2 = p2.preco * (1 - p2.desconto);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
		
	}

}
