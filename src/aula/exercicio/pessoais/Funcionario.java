package aula.exercicio.pessoais;

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 18/08/14

public class Funcionario extends Pessoa {
	private long carteiraProfissional;
	private double salario;
	private String dataAdmissao;

	public long getCarteiraProfissional() {
		return carteiraProfissional;
	}

	public void setCarteiraProfissional(long carteiraProfissional) {
		this.carteiraProfissional = carteiraProfissional;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

}
