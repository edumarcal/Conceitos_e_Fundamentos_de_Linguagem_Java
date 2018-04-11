package aula.exercicio.curso;

public class TesteCurso {

	public static void main(String[] args) {
		String nomeCurso = "Curso de tricot", descricao = "Neste curso você ira aprender tudo sobre tricot", codigo = "ctl";
		int cargaHoraria = 40;
		
		Curso curso = new Curso(nomeCurso, descricao, codigo, cargaHoraria);
		curso.imprime();

	}

}
