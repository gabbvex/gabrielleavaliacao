package atividade5;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		double numero;

		Scanner leituraDados = new Scanner(System.in);
		System.out.println("Digite um número: "); 
		numero = leituraDados.nextDouble();

		if (numero % 2 == 0) { //se o número digitado for divisor de 2 é par
			System.out.println("É par!");
		} else {
			System.out.println("É ímpar!");
		}
		leituraDados.close();
	}
}