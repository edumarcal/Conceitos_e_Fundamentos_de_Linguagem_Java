package aula.exercicio.data;


//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 14/08/14

public class TesteData {

	public static void main(String[] args) {
		Data data = new Data();
		data.dia = 12;
		data.mes = 1;
		data.ano = 2004;
		data.imprime();

		String bi = data.isAnoBissexto() ? " " : "nao";
		System.out.println("O ano " + data.ano + " " + bi + " e bissexto ");

		Data data2 = new Data();
		data2.imprime();
		data2.dia = -20;
		data2.mes = 23;
		data2.ano = 9;

		System.out.println(data2.dia);
		String bi2 = data2.isAnoBissexto() ? " " : " nao ";
		System.out.println("O ano " + data2.ano + bi2 + "e bissexto");
	}

}
