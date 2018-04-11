package trabalhofinal; //pacote onde estar localizada o arquivo fonte

import java.util.Random; //importa a classe Random, responsável por gerar o numero aleatório
import java.util.Scanner; // importa a classe Scanner, responsável pela captura de dados via teclado (System.in)

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 20/08/14

public class Parte03 { // Declaração da Classe

	private static Random random = new Random(); // Intância o objeto random
	
	// Instância o objeto Scanner e passa a opção com entrada do Sistema (System.in)
	private static Scanner scanner = new Scanner(System.in); 
	
	public static void main(String[] args) { //Método principal da classe
		
		System.out.println("Informe o numero: "); //Impressão no console, solicitando uma entrada de dados
		
		int numeroInformado; // Variável que servirá para armazena o valor informado  pelo usuário
		
		try { // Tenta executar esta instrução, caso de erro e lançada uma exceção
			
			numeroInformado = scanner.nextInt(); // Armazena o valor informado  pelo usuário atraves do teclado
				
		} catch (Exception e) { //captura a exceção lançado
			
			e.printStackTrace(); //Imprime a exceção capturada
			
			System.out.println("Favor informa apenas numeros"); //Imprime uma mensagem ao usuário para ele informa apenas numeros
			
			numeroInformado = scanner.nextInt(); //Solicita novamente que o usuário digite o numero
		
		}//fim do bloco de intrução try/catch
		
		
		// criar-se uma variável para armazena o valor gerado aleatóriamento (0-100) pelo random.
		// O valor passado no parâmetro é (101), pois o objeto random gera o valor entre 0 a enésimo menos 1
		int numeroSorteado = random.nextInt(101); 
		
		if (numeroSorteado == numeroInformado) { // Verifica se o numero informado é igual ao número gerado aleatoriamente
			
			// Imprime a mensagem no console que ele acertou, no caso da condição tenha sido satisfeita
			System.out.println("O numero sorteado foi: " + numeroSorteado + ". Parabéns você acertou!");
		
		} else { //Caso negativo da verificação
			
			// Imprime a mensagem no console que ele acertou, no caso da condição não tenha sido satisfeita
			System.out.println("O numero sorteado foi: " + numeroSorteado + ". Que pena você errou");
		
		}//fim do else
	
	}//Delimitador final do método principal

}//Delimitador final da classe
