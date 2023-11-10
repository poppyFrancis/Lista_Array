package questoes;

import javax.swing.JOptionPane;

/*
10. Criar um programa que seja capaz de capturar do teclado valores para
preenchimento de uma matriz M 3x3 do tipo inteiro. Após a captura imprima a matriz
criada e encontre a quantidade de números pares, a quantidade de números
ímpares. (2 pontos)
 */
public class Numero10 {

	public static void main(String[] args) {
		final int tamanho = 3;
		int[][] valores = new int[3][tamanho];
		StringBuilder msg = new StringBuilder();
		int[] quantidade = {0, 0};// INDICE: 0 = par, 1 = ímpar
		
	
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < tamanho; j++) {
				valores[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor para a posição ["+i+"]["+j+"]" , "Numero 10", JOptionPane.DEFAULT_OPTION));
				msg.append("Valor de -> valores[" + i + "][" + j + "] =  " + valores[i][j] + "\n");
				if(valores[i][j]%2==0) {
					quantidade[0]++;
				} else {
					quantidade[1]++;
				}
			}
		}
		msg.append("\nQuantidade de: Pares = " + quantidade[0] + " | ímpar = " + quantidade[1]);
		JOptionPane.showConfirmDialog(null,msg, "Numero 10", JOptionPane.DEFAULT_OPTION);
	
	}
}
