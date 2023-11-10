package questoes;

import javax.swing.JOptionPane;

/*
6. Criar um programa que contenha um vetor A com 6 elementos inteiros. inteiros
(Os valores devem ser solicitados ao usuário do sistema).
Construir um vetor B de mesmo tipo e tamanho, obedecendo as seguintes regras de
formação: (2 pontos)
a) Bi deverá receber 1 quando Ai for par;
b) Bi deverá receber 0 quando Ai for ímpar.
 */
public class Numero6 {

	public static void main(String[] args) {
		
		int[] A = new int[6];
		int[] B = new int[6];
		
		StringBuilder msg = new StringBuilder();
		
		for (int i = 0; i < A.length; i++) {
			A[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
			if(A[i]%2==0) {
				B[i] = 1;
			} else {
				B[i] = 0;
			}
			msg.append("Valor de A[" + i + "] = " + A[i] + " | Valor de B[" + i + "] = " + B[i] + "\n");
		}
		
		JOptionPane.showConfirmDialog(null,msg, "Numero 6", JOptionPane.DEFAULT_OPTION);
	}
}
