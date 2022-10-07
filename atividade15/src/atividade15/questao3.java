package atividade15;

import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		Scanner leituraDados = new Scanner(System.in);

		int num1, num2, i;

		System.out.println("Digite 2 números:");
		num1 = leituraDados.nextInt();
		num2 = leituraDados.nextInt();

		for (i = num1 + 1; i < num2; i++) {
			System.out.printf(i + " ");
		}
		for (i = num2 + 1; i < num1; i++) {
			System.out.printf(i + " ");
		}
		if (num1 == num2) {
			System.out.println("Não há intervalo.");
		}
		leituraDados.close();
	}
}