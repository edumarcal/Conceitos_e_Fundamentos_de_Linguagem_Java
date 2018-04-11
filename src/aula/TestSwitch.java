package aula;
	
	//Agradeco a Deus pelo dom do conhecimento
	//Eduardo Marcal
	//Codigo fonte criado em: 11/08/14

public class TestSwitch {
	
	public static void main(String[] args) {
		int diaSemana = 1;
		switch (diaSemana) {
		case 1:
			System.out.println("Segunda-feira");
			break;
		case 2:
			System.out.println("Terça-feira");
			break;
		case 3:
			System.out.println("Quarta-feira");
			break;
		case 4:
			System.out.println("Quinta-feira");
			break;
		case 5:
			System.out.println("Sexta-feira");
			System.out.println("Hoje ainda e dia de balada");
			break;
		case 6:
			System.out.println("Sabado");
			System.out.println("Hoje ainda e dia de balada");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Dia inválido");
			break;
		}

	}

}
