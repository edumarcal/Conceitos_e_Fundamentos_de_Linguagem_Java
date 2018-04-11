package trabalhofinal; //Pacote onde encontra-se esta classe

import java.util.Scanner; //Importa a classe Scanner, responsável por capturar os dados via telado

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 21/08/14

public class Parte01 { // Inicio da declaração da Classe

	//Cria um objeto scanner para capturar os dados de entrada do teclado
	private static Scanner scanner = new Scanner(System.in);
	
	private static int numeroVoltas = 0; // Variável para armazena o numeros de voltas
	private static double diametro = 0; // Armazena o diametro da roda da bicicleta em metros

	public static void main(String[] args) { // Inicio da declaração do metodo principal

		if (tentaPegarValores(scanner) == 1) { //Verifica a saída no console, caso o usuario informe os dados errados
			//Caso verdadeiro			
			
			double comprimento = Math.PI * (diametro / 2); //realiza a formula para obter o comprimento, usado a Classe Math chamando a constante pi
		
			// Realiza um cast para obter um numero inteiro apartir desta operação com numeros de precisão decimais
			int resultado = (int) (comprimento * numeroVoltas) + 1; // Acresta mais para que este valor seja o próximo

			System.out.println("A distância percorrida foi "+ resultado); // Imprime a distância percorrida
		}// Fim do delimitador do if, se a condição não retorna um ele não executa nada

	}// Fim do metodo principal

	public static int tentaPegarValores(Scanner scanner) { //Metodo reposnavel por lançar as exceções de erro do usuário
	
		try { // tenta realizar estes comando
			System.out.println("Digite a quantidade de voltas da roda da bicicleta"); // Solicita ao usuário que ele digite a quantidade de voltas
			
			numeroVoltas = scanner.nextInt(); // Armazena em numeros de voltas
			
			System.out.println("Digite o diâmtro da roda em metros"); // Solicita que o mesmo infome o diametro da roda da bicicleta
			
			diametro = scanner.nextDouble(); // Armazena o valor em diametro
			
			return 1; // retorna 1, para ser realizado a condição para impressão
			
		} catch (Exception e) { // Inicio do tratamento de exceção
			
			System.out.println("Informe apenas numeros"); // Informação ao usuário
			
			return 0; // Retorna nada para condição de impressão
			
		} // Fim do delimitador do bloco cath
	
	} // Fim do delimitador do metodo que tem a função de pegar valores
	
} // Fim da declaração da classe
