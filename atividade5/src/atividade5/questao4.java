package atividade5;

import java.util.Scanner;

public class questao4 {
	public static void main(String[] args) {

		int x, y, z;
		Scanner leituraDados = new Scanner(System.in);

		System.out.println("Digite o 1° número: ");
		x = leituraDados.nextInt();
		System.out.println("Digite o 2° número: ");
		y = leituraDados.nextInt();
		System.out.println("Digite o 3° número: ");
		z = leituraDados.nextInt();

		if (x < y && y < z)
			System.out.printf("%d %d %d", z, y, x);
		else if (x == y && y < z)
			System.out.printf("%d %d %d", z, y, x);
		else if (z < y && y == z)
			System.out.printf("%d %d %d", z, y, x);
		else if (x == z && z < y)
			System.out.printf("%d %d %d", y, z, x);
		else if (x < z && z < y)
			System.out.printf("%d %d %d", y, z, x);
		else if (y < x && x < z)
			System.out.printf("%d %d %d", z, x, y);
		else if (y < z && z < x)
			System.out.printf("%d %d %d", x, z, y);
		else if (z < x && x < y)
			System.out.printf("%d %d %d", y, x, z);
		else
			System.out.printf("%d %d %d", x, y, z);
		leituraDados.close();
	}
}