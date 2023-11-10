package questoes;

import javax.swing.JOptionPane;

/*
8. Criar um programa que seja capaz de capturar do teclado 10 valores double e
armazene-os em uma matriz de dimensões 2x5. No final o programa deverá imprimir
na tela a matriz com todos os elementos armazenados. (2 pontos)
 */
public class Numero8 {

	public static void main(String[] args) {
		final int tamanho = 5;
		double[][] valores = new double[2][tamanho];
		StringBuilder msg = new StringBuilder();
		
	
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < tamanho; j++) {
				valores[i][j] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor para a posição ["+i+"]["+j+"]" , "Numero 8", JOptionPane.DEFAULT_OPTION));
				msg.append("Valor de -> valores[" + i + "][" + j + "] =  " + valores[i][j] + "\n");
			}
		}
		JOptionPane.showConfirmDialog(null,msg, "Numero 6", JOptionPane.DEFAULT_OPTION);
	
	}
}
