package questoes.extra;

public class ValidarGanhador {
	
	/*
	 * 00 01 02 
	 * 10 11 12
	 * 20 21 22
	 */
	
	
	//COLUNA   -> 00 10 20 || 01 11 21 || 02 12 22
	private static  boolean verificarColuna(char[][] posicoes, char caracter) {
		if((posicoes[0][0]==caracter && posicoes[1][0]==caracter && posicoes[2][0]==caracter) 
				|| (posicoes[0][1]==caracter && posicoes[1][1]==caracter && posicoes[2][1]==caracter)
				|| (posicoes[0][2]==caracter && posicoes[1][2]==caracter && posicoes[2][2]==caracter)){
					return true;
				}
		return false;
	}
	
	//LINHA    -> 00 01 02 || 10 11 12 || 20 21 22
	private static  boolean verificarLinha(char[][] posicoes, char caracter) {
		if((posicoes[0][0]==caracter && posicoes[0][1]==caracter && posicoes[0][2]==caracter) 
				|| (posicoes[1][0]==caracter && posicoes[1][1]==caracter && posicoes[1][2]==caracter)
				|| (posicoes[2][0]==caracter && posicoes[2][1]==caracter && posicoes[2][2]==caracter)){
					return true;
				}
		return false;
	}
	
	//DIAGONAL -> 00 11 22 || 02 11 20
	private static boolean verificarDiagonal(char[][] posicoes, char caracter) {
		if((posicoes[0][0]==caracter && posicoes[1][1]==caracter && posicoes[2][2]==caracter) 
				|| (posicoes[0][2]==caracter && posicoes[1][1]==caracter && posicoes[2][0]==caracter)){
					return true;
				}
		return false;
	}
		
	public static boolean validacao(char[][] posicoes, char caracter) {
		return verificarDiagonal(posicoes,caracter) 
				|| verificarLinha(posicoes, caracter) 
				|| verificarColuna(posicoes, caracter);
	}
		
}