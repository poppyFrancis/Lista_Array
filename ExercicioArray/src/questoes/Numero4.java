package questoes;

import java.util.Random;

import javax.swing.JOptionPane;

/*
4. Criar um programa que contenha um vetor A com 10 elementos inteiros. (os
valores podem ser definidos pelo aluno, não precisa ser solicitado ao usuário).
No final o programa deverá imprimir na tela o percentual de elementos pares e
ímpares, respectivamente, armazenados neste vetor. (2 pontos)
 */
public class Numero4 {
	public static void main(String[] args) {

		int[] A = new int[10];
		int[] quantidade = { 0, 0 }; // INDICE: 0 = par && 1 = impar
		double porcentagem = 0;

		Random random = new Random();

		String[] mensagem = new String[11];

		for (int i = 0; i < A.length; i++) {
			A[i] = random.nextInt(10);

			if (A[i] % 2 == 0) {
				quantidade[0]++;
			} else {
				quantidade[1]++;
			}

			if (i == (A.length - 1)) {
				porcentagem = quantidade[0] * 10;
				for (int j = 0; j < A.length; j++) {
					if (j == (A.length - 1)) {
						mensagem[A.length] = "Porcentagem: par = " + porcentagem + "%  ímpar = " + (100 - porcentagem) + "%";
					}
					mensagem[j] = "Valor de A[" + j + "] = " + A[j];
				}
			}
		}
		JOptionPane.showConfirmDialog(null, 
				mensagem, 
				"Numero 4", 
				JOptionPane.DEFAULT_OPTION, 
				JOptionPane.INFORMATION_MESSAGE);
	}
}
