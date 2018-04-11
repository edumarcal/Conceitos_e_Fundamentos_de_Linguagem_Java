package aula;

import java.util.Scanner;

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 18/08/14

public class TresNomes {

	private static Scanner scanner;

	public static void main(String[] args) {
		String[] nome = new String[3];
		scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro nome: ");
		nome[0]= scanner.nextLine();
		System.out.print("Digite o segundo nome: ");
		nome[1] = scanner.nextLine();
		System.out.print("Digite o terceiro nome: ");
		nome[2] = scanner.nextLine();
		System.out.println("Primeiro ("+ nome[0]+") e terceiro ("+nome[2]+") nome");
		System.out.println("Segundo "+nome[1]);
	}

}
