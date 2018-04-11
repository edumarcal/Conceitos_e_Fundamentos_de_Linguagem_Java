package aula.exercicio.produto;

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 14/08/14

public class TesteProduto {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.inicializarValores(9.0, "Produto X", "Marca X");
		produto.imprime();

		// aumento de 10% no preço do produto
		produto.preco *= 1.1;
		produto.desricao = " Nova descricão";
		produto.marca = "Sem-marca";
		produto.imprime();

		Produto p = new Produto();
		p.valoresIniciais(9.0, "Produto Y", "Marca Y");
		p.imprime();
		p.aumentarPreco(10);
		p.setDescricao("Casual Class");
		p.setMarca("GlobalCode");
		p.imprime();
		// chamar o Garbega Collection
		// System.gc();
	}

}
