package questoes;

public class AuxNum5 {
	
	public static double calcularMedia(double... num) {
		double media = 0;
		for (int i = 0; i < num.length; i++) {
			media+=num[i];
		}
		return media/num.length;
	}
	
	
	
}
