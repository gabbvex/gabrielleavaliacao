package atividade8;

import java.util.Scanner;

public class questao2gabrielle {
	public static void main(String[] args) {
		double numero, total;

		Scanner leituraDados = new Scanner(System.in);

		System.out.println("Digite um número:");
		numero = leituraDados.nextDouble();

		if (numero % 2 == 0) {
			total = 25 + numero;
			System.out.println("O " + total);
			System.out.println("Que é um " + numero + " par");

		} else {
			System.out.println("O total não é par.");
		}

		leituraDados.close();
	}
}