package trabalhofinal; //Pacote onde estar localizado a classe

import java.util.Scanner; // Importa��o da classe Scanner

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 20/08/14

public class Parte02 { //Inicio da declara��o da classe

	private static Scanner scanner = new Scanner(System.in); // Intancia o objeto Scanner, respons�vel pela leitura do teclado
	private static int contagemDeOcorrencia = 0; // Variavel para contabilizar as ocorencias da palavra na frase
	private static String posicaoDaOcorrencia = ""; // Vari�vel para auxilar o processo de busca da palavra na frase
	private static boolean situacaoBuscar = true; // Vari�vel que vai informa a sistua��o da busca da palavra na frase, inciado como verdadeira
	private static int posicaoBusca = 0; // Posi��o onde sera lancada a verifica��o da palavra

	public static void main(String[] args) { // Inicio do M�todo principal

		System.out.println("Digite a frase"); // Solicita ao usu�rio que ele informe uma frase

		String frase = scanner.nextLine().toUpperCase(); // Armazena a frase em formato maiusculo, pois o java � case-sensitive

		System.out.println("Informe a palavra a ser procurada"); // Imprime a informa��o de solicita��o da palavra a ser buscada na frase

		String palavra = scanner.nextLine().toUpperCase(); // Armazena a palavra digitada pelo usu�rio e convete-a para maiusculo

		while (situacaoBuscar) { // Inicia a verifica��o

			if (posicaoBusca != frase.length()) { // Testa se a posi��o corrente da busca � diferente do tamanho da frase

				if (frase.startsWith(palavra, posicaoBusca)) { //Inicia a verifica��o da palavra passando a posi��o da busca
					//caso verdadeiro
					
					contagemDeOcorrencia += 1; // Atribui mais um a variavel contadora de ocorrencias 

					posicaoDaOcorrencia += posicaoBusca + ", "; // Armazena a posi��o de cada ocorrencia da palavra na frase

					posicaoBusca += 1; // Incrementa a posi��o da busca

				} else { //caso negativo
					
					posicaoBusca += 1; // Incrementa a posi��o da busca, se n�o incrementa cria um loop infinita!

				} // fim do delimitador do else

			} else { // Inicio do delimitador do else para o caso negativo, onde a posi��o � igual ao tamanho da frase
				// Caso tenha terminado o processo de busca

				situacaoBuscar = false; //Determina a condi��o de parada do loop while pois j� foi completamente verificado

			}// fim do delimitador do else para conclus�o do processo de busca

		}// Fim do delimitador do loop while

		posicaoBusca = frase.indexOf(palavra, 0); // Atribue a ela a primeira ocorrencia da palavra na frase, caso n�o exista ela assumira o valor -1

		if (posicaoBusca >= 0) { // Testa e existe ou n�o ocorrencias 
			//caso verdadeiro
			
			System.out.println("A palavra (" + palavra + ") come�a na posi��o "	+ posicaoBusca); // Imprime a primeira ocorrencia

			System.out.println("Existem " + contagemDeOcorrencia + " ocorrencias desta palavra"); // Imprime a contagem de ocorrencia

			System.out.println("As ocorrencias foram: " + posicaoDaOcorrencia); // Imprime quais foram as ocorrencias

		} else { // Inicio do bloco else (Sen�o)
			//Caso negativo
			
			// Imprime notificando que n�o existe esta palavra na frase
			System.out.println("N�o existe ocorrencia desta palavra (" + palavra + ") nesta frase"); 

		}// Fim do delimitador do else

	} // Fim do delimitador do m�todo principal

} // Fim da declara��o da classe
