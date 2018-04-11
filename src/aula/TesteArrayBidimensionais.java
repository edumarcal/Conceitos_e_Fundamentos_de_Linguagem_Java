package aula;

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 11/08/14

public class TesteArrayBidimensionais {

	public static void main(String[] args) {
		int[][] matriz = new int[2][3];
		// inicilaização elementos a elementos
		matriz[0][0] = 2;
		matriz[0][1] = 4;
		matriz[0][2] = 8;
		matriz[1][0] = 3;
		matriz[1][1] = 6;
		matriz[1][2] = 12;

		// impresão
		System.out.println("--------matriz------");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("[" + i + "," + j + "]=" + matriz[i][j]);
			}
		}

		// podemos inicializar o array inteiro juntamente com a declaração
		int[][] mesmaMatriz = { { 2, 4, 8 }, { 3, 6, 16 } };
		System.out.println("-----mesmaMatriz-----");
		for (int i = 0; i < mesmaMatriz.length; i++) {
			for (int j = 0; j < mesmaMatriz[i].length; j++) {
				System.out
						.println("[" + i + "," + j + "]=" + mesmaMatriz[i][j]);
			}
		}

		int outraMatriz[][] = new int[3][];
		int[] temp0 = { 2, 3 };
		outraMatriz[0] = temp0;

		int[] temp1 = { 1, 1, 1 };
		outraMatriz[1] = temp1;

		int[] temp2 = { 0, 0, 0, 0 };
		outraMatriz[2] = temp2;

		// Impressão dos elementos de outraMatriz
		System.out.println("-----outraMatriz-------");
		for (int i = 0; i < outraMatriz.length; i++) {
			for (int j = 0; j < outraMatriz[i].length; j++) {
				System.out
						.println("[" + i + "," + j + "]=" + outraMatriz[i][j]);
			}

		}
	}

}
