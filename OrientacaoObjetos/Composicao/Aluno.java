package OrientacaoObjetos.Composicao;

/* Uma relação de muitos para muitos bidirecional ocorre quando múltiplos objetos de uma classe estão associados a múltiplos objetos de outra classe,
 * e essa associação é bidirecional, o que significa que ambas as classes têm referências uma para a outra. */

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	final String nome;
	final List<Curso> cursos = new ArrayList<>();
	
	Aluno(String nome) {
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	Curso obterCursoPorNome(String nome) {
		for(Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
	}
	
	public String toString() {
		return nome;
	}

}
