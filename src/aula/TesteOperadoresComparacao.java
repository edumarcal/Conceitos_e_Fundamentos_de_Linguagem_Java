package aula;

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 12/08/14

public class TesteOperadoresComparacao {

	public static void main(String[] args) {
		int num1 = 2, num2 = 3, num3 = 2;

		boolean diferente = (num1 != num2);
		System.out.println(num1 + " != " + num2 + " : " + diferente);

		boolean igual = (num1 == num3);
		System.out.println(num1 + " == " + num3 + " : " + igual);

		boolean iguais = (num2 <= num3);
		System.out.println(num2 + " <= " + num3 + " : " + iguais);
	}

}
