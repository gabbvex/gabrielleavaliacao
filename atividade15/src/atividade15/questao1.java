package atividade15;

import java.util.Scanner;

public class questao1 {

	public class ww {
		public static void main(String[] args) {
			Scanner leituraDados = new Scanner(System.in);

			int numeros;
			int maior = 0;

			System.out.println("Digite 5 números:");
			numeros = leituraDados.nextInt();

			for (int i = 2; i <= 5; i++) {
				System.out.print("n" + i + ": ");
				numeros = leituraDados.nextInt();
				if (numeros > maior) {
					maior = numeros;
				}
			}

			System.out.println("O maior número entre os digitados é: " + maior);
			leituraDados.close();
		}
	}
}