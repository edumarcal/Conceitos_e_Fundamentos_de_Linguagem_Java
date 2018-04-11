package aula;

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 12/08/14

public class TesteDeslocamentoBitsPositivoDireita {

	public static void main(String[] args) {
		System.out.println("REGRA a cada deslocamento: (numero)/2");

		int numero = 16;
		System.out.print(Integer.toBinaryString(numero));
		System.out.println(" = " + numero);

		int resultado = numero >>> 1;
		System.out.print(Integer.toBinaryString(resultado));
		System.out.println(" = " + resultado);

		resultado = resultado >>> 1;
		System.out.print(Integer.toBinaryString(resultado));
		System.out.println(" = " + resultado);

		resultado = resultado >>> 1;
		System.out.print(Integer.toBinaryString(resultado));
		System.out.println(" = " + resultado);

		resultado = resultado >>> 1;
		System.out.print(Integer.toBinaryString(resultado));
		System.out.println(" = " + resultado);

		resultado = resultado >>> 1;
		System.out.print(Integer.toBinaryString(resultado));
		System.out.println(" = " + resultado);

	}

}
