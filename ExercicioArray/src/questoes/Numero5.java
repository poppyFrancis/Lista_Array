package questoes;

import javax.swing.JOptionPane;

/*
5. Criar um programa que seja possível ler as duas notas bimestrais para um
conjunto de 10 alunos. (Os valores devem ser solicitados ao usuário do sistema)
Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do tipo real.
Escreva um programa que calcule a média aritmética simples das notas informadas
armazenando o resultado em um vetor “Result” de mesmo tipo e tamanho. Ao
mostrar os resultados exibir a situação de cada aluno. Se a média calculada for
superior ou igual a 7 o aluno estará “aprovado”, caso contrário, a situação do aluno
será “reprovado”. (2 pontos)
 */

public class Numero5 {

	public static void main(String[] args) {

		double[] Nota1 = new double[10];
		double[] Nota2 = new double[10];
		double[] Result = new double[10];

		String[] nome = new String[10];
		StringBuilder msg = new StringBuilder();

		int controleNome = 0;
		for (int i = 0; i < Nota1.length; i++) {
			if (controleNome == 0) {
				nome[i] = JOptionPane.showInputDialog("Digite o nome do aluno de numeracao " + (i + 1));
			}
			Nota1[i] = Double.parseDouble(
					JOptionPane.showInputDialog("Digite a Nota 1 do aluno " + nome[i] + " de numeração " + (i + 1)));
			Nota2[i] = Double.parseDouble(
					JOptionPane.showInputDialog("Digite a Nota 2 do aluno " + nome[i] + " de numeração " + (i + 1)));
			if (Nota1[i] >= 0 && Nota1[i] <= 10 && Nota2[i] >= 0 && Nota2[i] <= 10) {
				String statusAluno = Result[i] >= 7 ? "Aprovado" : "Reprovado";
				Result[i] = AuxNum5.calcularMedia(Nota1[i], Nota2[i]);
				msg.append("Aluno: " + nome[i] + "de numeração " + (i + 1) + " | Nota 01: " + Nota1[i] + " Nota 02: "
						+ Nota2[i] + " | Status: " + statusAluno + " | Média: " + Result[i] + "\n");
			} else {
				String[] opcao = { "Colocar novo valor", "Manter", "Colocar novo nome e valor", "Sair"};
				controleNome++;
				int erro = JOptionPane.showOptionDialog(null, "Valores de Nota1 e/ou Nota2  inválidos. Tente novamente",
						"Numero 5 - erro", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, opcao,
						opcao[1]);
				if (erro == 0) {
					i--;
					continue;
				} else if(erro == 1) {
					controleNome = 0;
					continue;
				} else if(erro == 2) {
					controleNome = 0;
					i--;
					continue;
				} else {
					break;
				}
			}
		}
	}
}
