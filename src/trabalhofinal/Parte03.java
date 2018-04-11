package trabalhofinal; //pacote onde estar localizada o arquivo fonte

import java.util.Random; //importa a classe Random, respons�vel por gerar o numero aleat�rio
import java.util.Scanner; // importa a classe Scanner, respons�vel pela captura de dados via teclado (System.in)

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 20/08/14

public class Parte03 { // Declara��o da Classe

	private static Random random = new Random(); // Int�ncia o objeto random
	
	// Inst�ncia o objeto Scanner e passa a op��o com entrada do Sistema (System.in)
	private static Scanner scanner = new Scanner(System.in); 
	
	public static void main(String[] args) { //M�todo principal da classe
		
		System.out.println("Informe o numero: "); //Impress�o no console, solicitando uma entrada de dados
		
		int numeroInformado; // Vari�vel que servir� para armazena o valor informado  pelo usu�rio
		
		try { // Tenta executar esta instru��o, caso de erro e lan�ada uma exce��o
			
			numeroInformado = scanner.nextInt(); // Armazena o valor informado  pelo usu�rio atraves do teclado
				
		} catch (Exception e) { //captura a exce��o lan�ado
			
			e.printStackTrace(); //Imprime a exce��o capturada
			
			System.out.println("Favor informa apenas numeros"); //Imprime uma mensagem ao usu�rio para ele informa apenas numeros
			
			numeroInformado = scanner.nextInt(); //Solicita novamente que o usu�rio digite o numero
		
		}//fim do bloco de intru��o try/catch
		
		
		// criar-se uma vari�vel para armazena o valor gerado aleat�riamento (0-100) pelo random.
		// O valor passado no par�metro � (101), pois o objeto random gera o valor entre 0 a en�simo menos 1
		int numeroSorteado = random.nextInt(101); 
		
		if (numeroSorteado == numeroInformado) { // Verifica se o numero informado � igual ao n�mero gerado aleatoriamente
			
			// Imprime a mensagem no console que ele acertou, no caso da condi��o tenha sido satisfeita
			System.out.println("O numero sorteado foi: " + numeroSorteado + ". Parab�ns voc� acertou!");
		
		} else { //Caso negativo da verifica��o
			
			// Imprime a mensagem no console que ele acertou, no caso da condi��o n�o tenha sido satisfeita
			System.out.println("O numero sorteado foi: " + numeroSorteado + ". Que pena voc� errou");
		
		}//fim do else
	
	}//Delimitador final do m�todo principal

}//Delimitador final da classe
