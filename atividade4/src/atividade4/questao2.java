package atividade4;
//questao2

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		double numero;

		Scanner leituraDados = new Scanner(System.in);
		System.out.println("Digite um número: ");
		numero = leituraDados.nextDouble();

		if (numero % 5 == 0) {
			System.out.println("É multiplo de 5");
		} else {
			System.out.println("Não é multiplo de 5");
		}
		leituraDados.close();
	}
}