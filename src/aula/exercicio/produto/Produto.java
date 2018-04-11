package aula.exercicio.produto;

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 14/08/14

public class Produto {
	double preco;
	String desricao, marca;

	void valoresIniciais(double umPreco, String umaDescricao) {
		this.valoresIniciais(umPreco, umaDescricao, null);
	}

	void valoresIniciais(double umPreco, String umaDescricao, String umaMarca) {
		alterarPreco(umPreco);
		setDescricao(umaDescricao);
		setMarca(umaMarca);
	}

	String getDescicao() {
		return desricao;
	}

	void setDescricao(String novaDescricao) {
		desricao = novaDescricao;
	}

	String getMarca() {
		return marca;
	}

	void setMarca(String novaMarca) {
		marca = novaMarca;
	}

	double getPreco() {
		return preco;
	}

	void alterarPreco(double novoPreco) {
		if (novoPreco > 0) {
			preco = novoPreco;
		}
	}

	void aumentarPreco(double porcentagem) {
		if (porcentagem > 0) {
			System.out.println("aumentando o preco em " + porcentagem + "%");
			porcentagem = 1 + (porcentagem / 100);
			preco *= porcentagem;
		} else {
			System.out.println("aumento deve ser maior do que zero");
		}
	}

	// Usar o construtor e melhor
	void inicializarValores(double umPreco, String umaDescricao, String umMarca) {
		preco = umPreco;
		desricao = umaDescricao;
		marca = umMarca;
	}

	void imprime() {
		System.out.println("---------------------");
		System.out.println("Produto: " + desricao);
		System.out.println("Marca: " + marca);
		System.out.println("Descrição: " + desricao);
		System.out.println("---------------------");
	}
}
