package questoes;

import java.util.Arrays;

import javax.swing.JOptionPane;

/*
 7. Criar um programa que solicite o usuário informar 10 valores do tipo inteiro, e a
No final o programa deverá colocá-los em ordem crescente e imprimir na tela os
elementos ordenados. (2 pontos)
OBS: sugestão trabalhar com vetor.
 */
public class Numero7 {

	public static void main(String[] args) {
	
		int[] num = new int[10];
		StringBuilder mensagem = new StringBuilder();
		mensagem.append("DESORDENADOS: ");
		
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));		
			mensagem.append(num[i] + " ");
		}
		Arrays.sort(num);
		
		mensagem.append("\n\nORDENADOS: ");
		for (int i = 0; i < num.length; i++) {
			mensagem.append(num[i] + " ");
		}
		
		JOptionPane.showMessageDialog(null, mensagem, "Numero 7", JOptionPane.INFORMATION_MESSAGE, null);
	}	
}
