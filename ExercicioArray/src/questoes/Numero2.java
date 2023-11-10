package questoes;

import java.util.Random;

import javax.swing.JOptionPane;
/*
2. Criar um programa que contenha dois vetores A e B cada um com 10 elementos
inteiros. (os valores podem ser definidos pelo aluno, não precisa ser solicitado ao
usuário). Gerar um terceiro vetor C, onde cada elemento de C é a soma dos
respectivos elementos em A e B.
No final o programa deverá imprimir na tela os valores de cada vetor. (2 pontos)
 */
public class Numero2 {

	public static void main(String[] args) {
		int[] A = new int[10];
		int[] B = new int[10];
		int[] C = new int[10];
		
		
		Random random = new Random();
		
		String[] mensagem = new String[10];
		
		
		for (int i = 0; i < B.length; i++) {
			A[i] = random.nextInt(10);
			B[i] = random.nextInt(10);
			C[i] = A[i] + B[i];
			
			mensagem[i] = "Valor de A[" + i + "] = " + A[i] 
			+ "\nValor de B[" + i + "] = " + B[i] 
			+ "\nValor de C[" + i + "] = " + A[i] 
			+ " + " + B[i] + " = " +  C[i] ;
		}
		
		JOptionPane.showConfirmDialog(null, 
				mensagem, 
				"Numero 2", 
				JOptionPane.DEFAULT_OPTION, 
				JOptionPane.INFORMATION_MESSAGE);
	}
}
