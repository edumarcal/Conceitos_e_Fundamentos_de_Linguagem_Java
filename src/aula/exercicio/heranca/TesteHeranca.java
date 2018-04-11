package aula.exercicio.heranca;

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 18/08/14

public class TesteHeranca {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		System.out.println(calculadora.soma(10, 37));

		CalculadoraPlus calculadoraPlus = new CalculadoraPlus();
		System.out.println(calculadoraPlus.soma(20, 10));
		System.out.println(calculadoraPlus.multipcacao(10, 2));

	}

}
