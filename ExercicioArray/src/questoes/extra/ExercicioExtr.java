package questoes.extra;

import javax.swing.JOptionPane;

/*
#################### DESAFIO (5 PONTOS EXTRAS) ####################
Regras: Por se tratar de um desafio! Com uma grande recompensa, apenas
será apresentado a correção e explanação de pontos falhos em particular para
o aluno que entregar o código! Ou durante a aula se TODOS alunos fizer a
atividade de ninguém perder média no desafio.

Faça um programa para jogar o jogo da velha. O programa deve permitir que dois
jogadores façam uma partida do jogo da velha, usando o computador para ver o
tabuleiro. Cada jogador vai alternadamente informando a posição onde deseja
colocar a sua peça (‘O’ ou ‘X’). O programa deve impedir jogadas inválidas e
determinar automaticamente quando o jogo terminou e quem foi o vencedor
(jogador1 ou jogador2). A cada nova jogada, o programa deve atualizar a situação
do tabuleiro na tela.
 */
public class ExercicioExtr {

	public static void mensagemErro() {
		JOptionPane.showMessageDialog(null, "Algo deu errado. Tente novamente", "Erro", JOptionPane.ERROR_MESSAGE,
				null);
	}

	public static void main(String[] args) {

		final char[] jogos = { 'X', 'O', ' ' }; // INDICE: X = PAR, O = ÍMPAR
		int qualJogar = 0;
		int contagemDeJogadas = 0;
		char[][] posicoes = { { jogos[2], jogos[2], jogos[2] }, { jogos[2], jogos[2], jogos[2] },
				{ jogos[2], jogos[2], jogos[2] } };

		boolean ganhar = true;
		int jogada = 0;

		StringBuilder mensagem = new StringBuilder();

		do {
			mensagem.setLength(0);
			mensagem.append("            A       B       C" + "\n       1      " + posicoes[0][0] + " |   "
					+ posicoes[0][1] + "  | " + posicoes[0][2] + "\n            ------------------" + "\n       2      "
					+ posicoes[1][0] + " |   " + posicoes[1][1] + "  | " + posicoes[1][2]
					+ "\n            ------------------" + "\n       3      " + posicoes[2][0] + " |   "
					+ posicoes[2][1] + "  | " + posicoes[2][2] + "\n\n\n");

			String opcaoUsuario = JOptionPane.showInputDialog(null, mensagem, 
					"Vez do " +(char)(qualJogar%2==0 ? jogos[0] : jogos[1]), 
					JOptionPane.INFORMATION_MESSAGE);
			int opcao;
			char guardarValor = ' ';

			if (Character.isLetter(opcaoUsuario.charAt(0))) { // 1 digito e letra A1
				opcao = Integer.parseInt(String.valueOf(opcaoUsuario.charAt(1))) - 1;
				guardarValor = opcaoUsuario.charAt(0);
			} else { // 1 digito nao e letra 1A
				opcao = Integer.parseInt(String.valueOf(opcaoUsuario.charAt(0))) - 1; 
				guardarValor = opcaoUsuario.charAt(1);
			}
			
			if (opcao >= 0 && opcao <= 2) {
				if (guardarValor == 'A' || guardarValor == 'a') {
					jogada = 0;
				} else if (guardarValor == 'B' || guardarValor == 'b') {
					jogada = 1;
				} else if (guardarValor == 'C' || guardarValor == 'c') {
					jogada = 2;
				} else {
					mensagemErro();
					continue;
				}
			} else {
				mensagemErro();
				continue;
			}
			
			if(posicoes[opcao][jogada]!=jogos[0] && posicoes[opcao][jogada]!=jogos[1]) {
				posicoes[opcao][jogada] = qualJogar%2==0? jogos[0] : jogos[1];
			} else {
				mensagemErro();
				qualJogar=qualJogar-2;
				continue;
			}
			
			if (qualJogar % 2 == 0) {
				posicoes[opcao][jogada] = jogos[0];
			} else {
				posicoes[opcao][jogada] = jogos[1];
			}
			if (ValidarGanhador.validacao(posicoes, qualJogar%2 == 0 ? jogos[0] : jogos[1])) {
				ganhar=false;
				break;
			}
			qualJogar++;
			contagemDeJogadas++;
			if(contagemDeJogadas==9) {
				JOptionPane.showMessageDialog(null, "DEU VELHA!", "VELHA", JOptionPane.INFORMATION_MESSAGE, null);
				break;
			}
		} while (ganhar);
		if (qualJogar% 2 == 0) {
			JOptionPane.showMessageDialog(null, "\"X\" GANHOU", "GANHADOR", JOptionPane.INFORMATION_MESSAGE, null);
		} else if(!(ganhar)){
			JOptionPane.showMessageDialog(null, "\"O\" GANHOU", "GANHADOR", JOptionPane.INFORMATION_MESSAGE, null);
		} 
	}
}