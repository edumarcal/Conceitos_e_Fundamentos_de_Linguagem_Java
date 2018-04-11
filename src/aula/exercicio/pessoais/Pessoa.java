package aula.exercicio.pessoais;

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 18/08/14

public class Pessoa {
	private Endereco endereco;
	private String nome, rg;

	public void imprime(){
		System.out.println("Nome: "+this.getNome());
		System.out.println("RG: "+this.getRg());
		System.out.print("Endereco: "+this.getEndereco().getRua());
		System.out.println(" , "+this.getEndereco().getNumero());
	}
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
}
