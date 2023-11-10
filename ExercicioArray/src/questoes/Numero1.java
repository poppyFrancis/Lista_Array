package questoes;

import java.util.Random;

import javax.swing.JOptionPane;
/*
1. Criar um programa que contenha um vetor A com 10 elementos inteiros (os
valores podem ser definidos pelo aluno, não precisa ser solicitado ao usuário). É um
vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o respectivo elemento de A multiplicado por sua posição (ou índice).
No final o programa deverá imprimir na tela os valores de cada vetor. (2 pontos)
 */
public class Numero1 {

	public static void main(String[] args) {
		int[] A = new int[10];
		int[] B = new int[10];
		
		Random random = new Random();
		
		String[] mensagem = new String[10];
		
		
		for (int i = 0; i < B.length; i++) {
			A[i] = random.nextInt(10);
			B[i] = A[i] * i;
			
			mensagem[i] = "Valor de A[" + i + "] = " + A[i] + "\nValor de B[" + i + "] = " + A[i] + " * " + i + " = " + (B[i]);
		}
		
		JOptionPane.showConfirmDialog(null, 
				mensagem, 
				"Numero 1", 
				JOptionPane.DEFAULT_OPTION, 
				JOptionPane.INFORMATION_MESSAGE);
	}
}
