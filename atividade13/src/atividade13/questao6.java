package atividade13;

import java.util.Scanner;

public class questao6 {

	public static void main(String[] args) {
		int i, n = 0, s = 0;
		Scanner leituraDados = new Scanner(System.in);
		System.out.println("Digite 5 números para serem somados: ");

		for (i = 0; i < 5; i++) {

			n = leituraDados.nextInt();
			s += n;

		}
		System.out.println("A soma dos 5 números é: " + s);
		leituraDados.close();
	}
}