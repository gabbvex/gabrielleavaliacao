package atividade3;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		int x, y, z;
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		x = input.nextInt();
		System.out.println("Digite o segundo número: ");
		y = input.nextInt();

		z = x;
		x = y;
		y = z;

		System.out.println("Os valores trocados são: " + x + " e " + y);

		input.close();
	}
}