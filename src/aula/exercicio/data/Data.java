package aula.exercicio.data;

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 14/08/14

public class Data {
	int dia, mes, ano;

	boolean isAnoBissexto() {
		if ((ano % 4 == 0) && !(ano % 100 == 0) || (ano % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	void imprime() {
		System.out.println(dia + "/" + mes + "/" + ano);
	}
}
