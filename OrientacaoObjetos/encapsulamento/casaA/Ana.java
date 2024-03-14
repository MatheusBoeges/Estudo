package OrientacaoObjetos.encapsulamento.casaA;

public class Ana {
	
	// Os membros marcados como private são acessíveis apenas dentro da própria classe em que são declarados. Eles não podem ser acessados de fora da classe.
	
	@SuppressWarnings("unused")
	private String segredo = "...";
	
	/* Os membros marcados como padrão (sem modificador) têm acesso dentro da mesma classe e de classes do mesmo pacote.
	 * Eles não podem ser acessados de subclasses fora do pacote em que são declarados. */
	
	String facoDentroDeCasa = "..."; // Default ou padrão
	
	// Os membros marcados como protected são acessíveis apenas para classes no mesmo pacote ou subclasses (herdeiras) da classe em que estão declarados.
	
	protected String formaDeFalar = "...";
	
	//Os membros marcados como public são acessíveis a todas as classes, não importa onde estejam localizadas. Isso significa que eles podem ser acessados por qualquer outra classe.
	
	public String todosSabem = "...";

}
