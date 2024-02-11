package Classe;

public class EstaticosTeste {
	
	public static void main(String[] args) {
		
		// Membros de Instância: Para acessar membros de instância, é necessário criar um objeto da classe usando new e acessar os membros usando a referência do objeto (objeto.membro).
		Estaticos a1 = new Estaticos(10);
		a1.raio = 10;
		System.out.println(a1.area());
		
	
		// Membros de Classe: Os membros de classe podem ser acessados diretamente usando o nome da classe (Classe.membro), não requerem um objeto.
		System.out.println(Estaticos.area(100));
		System.out.println(Estaticos.PI);
		System.out.println(Math.PI);
		
		/* Em resumo, os membros de instância são exclusivos para cada objeto,
		 * enquanto os membros de classe são compartilhados por todos os objetos da classe e podem ser acessados sem a necessidade de criar um objeto. */
		
	}

}
