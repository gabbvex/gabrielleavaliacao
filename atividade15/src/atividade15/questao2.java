package atividade15;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		Scanner leituraDados = new Scanner(System.in);

		int numeros;
		int soma = 0;

		System.out.println("Digite 5 números:");
		numeros = leituraDados.nextInt();

		for (int i = 0; i < numeros; i++) {
			System.out.print("n" + i + ": ");
			numeros = leituraDados.nextInt();
			soma = soma + numeros;
		}

		int media = soma / numeros;
		System.out.println("A soma é: " + soma);
		System.out.println("A média entre eles é: " + media);
		leituraDados.close();
	}
}