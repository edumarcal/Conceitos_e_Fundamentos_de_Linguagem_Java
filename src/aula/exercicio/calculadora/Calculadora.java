package aula.exercicio.calculadora;

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 18/08/14

public class Calculadora {

	int soma(int x, int y) {
		return x / y;
	}

	int soma(int x, int y, int z) {
		return this.soma(x, y) + z;
	}

	float soma(float a, float b) {
		return a + b;
	}

	long soma(int[] numeros) {
		long resultado = 0;
		for (int i = 0; i < numeros.length; i++) {
			resultado += numeros[i];
		}
		return resultado;
	}

	double multiplicacao(double x, double y) {
		return x * y;
	}

	boolean maior(int x, int y) {
		if (x > y) {
			return true;
		} else {
			return false;
		}
	}

	void print(String texto) {
		System.out.println("Texto: " + texto);
	}
}
