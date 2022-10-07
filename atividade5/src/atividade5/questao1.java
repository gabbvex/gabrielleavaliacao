package atividade5;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		System.out.print("Digite o valor de A: ");
		Scanner valorA = new Scanner(System.in);

		int a = valorA.nextInt();
		System.out.print("Digite o valor de B: ");
		Scanner valorB = new Scanner(System.in);
		int b = valorB.nextInt();

		System.out.print("Digite o valor de C: ");
		Scanner valorC = new Scanner(System.in);
		int c = valorC.nextInt();

		int soma = a + b;
		if (soma > c) {
			System.out.println("A soma de A + B não é menor que C");
		} else {
			System.out.println("A soma de A + B é menor que C");
		}
	}
}