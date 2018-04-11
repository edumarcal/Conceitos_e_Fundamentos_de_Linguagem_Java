package aula.exercicio.pessoais;

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 18/08/14

public class TesteFuncionario {

	public static void main(String[] args) {
		Endereco endereco = new Endereco("Rua do tulipas", 1200);
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Pedro da Silva");
		funcionario.setEndereco(endereco);
		funcionario.setRg("1234567");

		funcionario.setSalario(1_000);
		funcionario.setCarteiraProfissional(1234567L);
		funcionario.imprime();
	}

}
