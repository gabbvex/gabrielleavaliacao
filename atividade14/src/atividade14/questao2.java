package atividade14;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		Scanner leituraDados = new Scanner(System.in);
		System.out.println("Digite o valor do boleto: ");

		double amount1 = 0; // quantia em deposito ao fim de cada mes
		double boleto = 1000.0; // quantidade inicial do boleto antes dos juros
		double rate = 15; // taxa de juros

		double amount2; // quantia em deposito ao fim do primeiro mes

		boleto = leituraDados.nextInt();

		System.out.printf("%s%20s %n", "Parcela", "Valor do boleto"); // formatação

		for (int mes = 1; mes <= 10; ++mes) {

			amount1 = boleto * (Math.pow((1 + rate / 100), mes));

			System.out.printf("%4d%,20.2f%n", mes, amount1); // ano e quantidade
		}

		System.out.printf("%s%20s %n", "Parcela", "Valor do boleto"); // formatação
		amount2 = boleto;
		for (int mes = 1; mes <= 10; ++mes) {

			amount2 = amount2 + 300;

			System.out.printf("%4d%,20.2f%n", mes, amount2); // ano e quantidade
		}

		if (amount1 < amount2) {
			System.out.println("O juros composto é melhor");
		} else {
			System.out.println("O juros simples é melhor");
		}

		leituraDados.close();
	}
}