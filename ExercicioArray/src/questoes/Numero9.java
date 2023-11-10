package questoes;

import java.util.Random;

import javax.swing.JOptionPane;

/*
9. Criar um programa que seja capaz de gerar e apresentar em tela uma matriz M
4x4 com valores aleatórios entre 0-9. No final o programa deverá imprimir na tela o
maior número da matriz e a sua posição (linha, coluna). (2 pontos)
 */
public class Numero9 {

	public static void main(String[] args) {
		final int tamanho = 4;
		int[][] M = new int[4][tamanho];
		
		Random random = new Random();
		int maior = 0;
		int[] posicao = new int[2]; // INDICE: 0 = i, 1 = j
		StringBuilder msg = new StringBuilder();
		
		
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				M[i][j] = random.nextInt(10);
				if(M[i][j]>maior) {
					maior=M[i][j];
					posicao[0] = i;
					posicao[1] = j;
				}
				msg.append(M[i][j]).append(j == (tamanho-1) ? "\n" : " ");
			}
		}
		msg.append("\nMaior valor = " + maior + ". Ele se encontra na posição[" + (1+posicao[0]) + "][" + (1+posicao[1]) + "]");
		JOptionPane.showConfirmDialog(null,msg, "Numero 9", JOptionPane.DEFAULT_OPTION);
	}
	
}
