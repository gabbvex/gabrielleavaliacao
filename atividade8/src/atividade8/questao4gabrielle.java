package atividade8;

import java.util.Scanner;

public class questao4gabrielle {

	public static void main(String[] args) {
		int x, y;
		Scanner leituraDados = new Scanner(System.in);

		System.out.println("Digite um número:");
		x = leituraDados.nextInt();
		System.out.println("Digite um número:");
		y = leituraDados.nextInt();

		if (x < y) {
			System.out.printf("%d %d", x, y);
		} else if (x > y) {
			System.out.printf("%d %d", y, x);
		} else {
			System.out.println("Os valores são semelhantes");
		}

		leituraDados.close();
	}
}