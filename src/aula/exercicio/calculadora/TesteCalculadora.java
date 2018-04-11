package aula.exercicio.calculadora;


//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 14/08/14

public class TesteCalculadora {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		calculadora.print("Vamos testar a calculadora");
		
		int resultado = calculadora.soma(10, 10);
		System.out.println("10+10= " + resultado);
		
		double resultado2 = calculadora.multiplicacao(10, 10);
		System.out.println("10*10= " + resultado2);
		
		boolean resultado3 = calculadora.maior(20, 100);
		System.out.println("20>100= " + resultado3);
	}

}
