package trabalhofinal; //Pacote onde estar localizado a classe

import java.util.Scanner; // Importação da classe Scanner

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 20/08/14

public class Parte02 { //Inicio da declaração da classe

	private static Scanner scanner = new Scanner(System.in); // Intancia o objeto Scanner, responsável pela leitura do teclado
	private static int contagemDeOcorrencia = 0; // Variavel para contabilizar as ocorencias da palavra na frase
	private static String posicaoDaOcorrencia = ""; // Variável para auxilar o processo de busca da palavra na frase
	private static boolean situacaoBuscar = true; // Variável que vai informa a sistuação da busca da palavra na frase, inciado como verdadeira
	private static int posicaoBusca = 0; // Posição onde sera lancada a verificação da palavra

	public static void main(String[] args) { // Inicio do Método principal

		System.out.println("Digite a frase"); // Solicita ao usuário que ele informe uma frase

		String frase = scanner.nextLine().toUpperCase(); // Armazena a frase em formato maiusculo, pois o java é case-sensitive

		System.out.println("Informe a palavra a ser procurada"); // Imprime a informação de solicitação da palavra a ser buscada na frase

		String palavra = scanner.nextLine().toUpperCase(); // Armazena a palavra digitada pelo usuário e convete-a para maiusculo

		while (situacaoBuscar) { // Inicia a verificação

			if (posicaoBusca != frase.length()) { // Testa se a posição corrente da busca é diferente do tamanho da frase

				if (frase.startsWith(palavra, posicaoBusca)) { //Inicia a verificação da palavra passando a posição da busca
					//caso verdadeiro
					
					contagemDeOcorrencia += 1; // Atribui mais um a variavel contadora de ocorrencias 

					posicaoDaOcorrencia += posicaoBusca + ", "; // Armazena a posição de cada ocorrencia da palavra na frase

					posicaoBusca += 1; // Incrementa a posição da busca

				} else { //caso negativo
					
					posicaoBusca += 1; // Incrementa a posição da busca, se não incrementa cria um loop infinita!

				} // fim do delimitador do else

			} else { // Inicio do delimitador do else para o caso negativo, onde a posição é igual ao tamanho da frase
				// Caso tenha terminado o processo de busca

				situacaoBuscar = false; //Determina a condição de parada do loop while pois já foi completamente verificado

			}// fim do delimitador do else para conclusão do processo de busca

		}// Fim do delimitador do loop while

		posicaoBusca = frase.indexOf(palavra, 0); // Atribue a ela a primeira ocorrencia da palavra na frase, caso não exista ela assumira o valor -1

		if (posicaoBusca >= 0) { // Testa e existe ou não ocorrencias 
			//caso verdadeiro
			
			System.out.println("A palavra (" + palavra + ") começa na posição "	+ posicaoBusca); // Imprime a primeira ocorrencia

			System.out.println("Existem " + contagemDeOcorrencia + " ocorrencias desta palavra"); // Imprime a contagem de ocorrencia

			System.out.println("As ocorrencias foram: " + posicaoDaOcorrencia); // Imprime quais foram as ocorrencias

		} else { // Inicio do bloco else (Senão)
			//Caso negativo
			
			// Imprime notificando que não existe esta palavra na frase
			System.out.println("Não existe ocorrencia desta palavra (" + palavra + ") nesta frase"); 

		}// Fim do delimitador do else

	} // Fim do delimitador do método principal

} // Fim da declaração da classe
