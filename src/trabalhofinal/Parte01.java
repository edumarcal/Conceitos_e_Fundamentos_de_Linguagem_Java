package trabalhofinal; //Pacote onde encontra-se esta classe

import java.util.Scanner; //Importa a classe Scanner, respons�vel por capturar os dados via telado

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 21/08/14

public class Parte01 { // Inicio da declara��o da Classe

	//Cria um objeto scanner para capturar os dados de entrada do teclado
	private static Scanner scanner = new Scanner(System.in);
	
	private static int numeroVoltas = 0; // Vari�vel para armazena o numeros de voltas
	private static double diametro = 0; // Armazena o diametro da roda da bicicleta em metros

	public static void main(String[] args) { // Inicio da declara��o do metodo principal

		if (tentaPegarValores(scanner) == 1) { //Verifica a sa�da no console, caso o usuario informe os dados errados
			//Caso verdadeiro			
			
			double comprimento = Math.PI * (diametro / 2); //realiza a formula para obter o comprimento, usado a Classe Math chamando a constante pi
		
			// Realiza um cast para obter um numero inteiro apartir desta opera��o com numeros de precis�o decimais
			int resultado = (int) (comprimento * numeroVoltas) + 1; // Acresta mais para que este valor seja o pr�ximo

			System.out.println("A dist�ncia percorrida foi "+ resultado); // Imprime a dist�ncia percorrida
		}// Fim do delimitador do if, se a condi��o n�o retorna um ele n�o executa nada

	}// Fim do metodo principal

	public static int tentaPegarValores(Scanner scanner) { //Metodo reposnavel por lan�ar as exce��es de erro do usu�rio
	
		try { // tenta realizar estes comando
			System.out.println("Digite a quantidade de voltas da roda da bicicleta"); // Solicita ao usu�rio que ele digite a quantidade de voltas
			
			numeroVoltas = scanner.nextInt(); // Armazena em numeros de voltas
			
			System.out.println("Digite o di�mtro da roda em metros"); // Solicita que o mesmo infome o diametro da roda da bicicleta
			
			diametro = scanner.nextDouble(); // Armazena o valor em diametro
			
			return 1; // retorna 1, para ser realizado a condi��o para impress�o
			
		} catch (Exception e) { // Inicio do tratamento de exce��o
			
			System.out.println("Informe apenas numeros"); // Informa��o ao usu�rio
			
			return 0; // Retorna nada para condi��o de impress�o
			
		} // Fim do delimitador do bloco cath
	
	} // Fim do delimitador do metodo que tem a fun��o de pegar valores
	
} // Fim da declara��o da classe
