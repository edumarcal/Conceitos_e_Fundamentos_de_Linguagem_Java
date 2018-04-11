package aula;

import javax.swing.JOptionPane;

//Agradeco a Deus pelo dom do conhecimento
//Eduardo Marcal
//Codigo fonte criado em: 18/08/14

public class Inverte {

	public static void main(String[] args) {
		try {
			String palavra = JOptionPane.showInputDialog(null, "Digite a palavra");
			String frase = "";
			for (int i = palavra.length()-1; i >=0; i--) {
				frase += palavra.charAt(i);
			}
			JOptionPane.showMessageDialog(null, frase);
		} catch (Exception e) {
			e.getMessage();
		}

	}

}
