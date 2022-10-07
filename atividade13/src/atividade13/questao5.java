package atividade13;

import java.util.Scanner;

public class questao5 {

	public static void main(String arg[]) {
		Scanner leituraDados = new Scanner(System.in);

		System.out.println("Digite o número fatorial a ser calculado: ");
		int num = leituraDados.nextInt();
		int fatorial = 1;

		for (int i = 1; i <= num; i++) {

			fatorial = fatorial * i;
		}

		System.out.println("o número fatorial de: " + num);
		System.out.println("é: " + fatorial);
		leituraDados.close();
	}
}