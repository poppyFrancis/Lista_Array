package questoes;

import java.util.Random;

import javax.swing.JOptionPane;

/*
3. Criar um programa que contenha um vetor A com 10 elementos inteiros. (os
valores podem ser definidos pelo aluno, não precisa ser solicitado ao usuário).
No final o programa deverá imprimir na tela a soma de todos os elementos
armazenados neste vetor. (2 pontos)
 */
public class Numero3 {

	public static void main(String[] args) {
		int[] A = new int[10];
		int soma = 0;
		Random random = new Random();
		
		String[] mensagem = new String[11];
		
		
		for (int i = 0; i < A.length; i++) {
			A[i] = random.nextInt(10);
			soma += A[i];
			mensagem[i] = "Valor de A[" + i + "] = " + A[i];
			
			if(i==(A.length-1)) {
				StringBuilder aux = new StringBuilder();
				
				for(int j = 0; j < A.length; j++) {
					if(j==(A.length-2)) {
						aux.append(A[j] + " = " + soma); 	
					} else if (j!=(A.length-1)){
						aux.append(A[j] + " + ");
					}
				}
				mensagem[10] = "Valor da soma: " + aux;
			}
		}
		
		JOptionPane.showConfirmDialog(null, 
				mensagem, 
				"Numero 3", 
				JOptionPane.DEFAULT_OPTION, 
				JOptionPane.INFORMATION_MESSAGE);
		
		
	}
}
