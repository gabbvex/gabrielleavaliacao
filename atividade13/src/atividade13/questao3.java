package atividade13;

import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {

		Scanner leituraDados = new Scanner(System.in);
		int numero = 10;
		int soma = 0;

		for (int loop = 1; loop <= 10; loop++) {
			int out = loop * numero;
			soma += out;
			System.out.println(out);
		}
		System.out.println("A soma dos números é " + soma);
		leituraDados.close();
	}
}