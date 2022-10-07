package atividade13;

public class questao4 {

	public static void main(String[] args) {

		for (int variavel = 0, variavel2 = 100 * 3; variavel < 100 && variavel2 > 0; variavel++, variavel2--) {
			
			if (variavel2 % 3 == 0) {
				System.out.println(" Multiplo de 3");
			} else if (variavel >= 0) {
				System.out.println(variavel);
			}
		}
	}
}