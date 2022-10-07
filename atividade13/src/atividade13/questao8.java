package atividade13;

import java.util.Scanner;

public class questao8 {

	public static void main(String[] args) {
		Scanner leituraDados = new Scanner(System.in);
		System.out.println("Digite o valor do boleto: ");

		double amount; // quantia em deposito ao fim de cada mes
		double boleto = 1000.0; // quantidade inicial do boleto antes dos juros
		double rate = 15; // taxa de juros

		boleto = leituraDados.nextInt();

		System.out.printf("%s%20s %n", "Parcela", "Valor do boleto"); // formatação

		for (int mes = 1; mes <= 10; ++mes) {

			amount = boleto * (Math.pow((1 + rate / 100), mes));

			System.out.printf("%4d%,20.2f%n", mes, amount); // ano e quantidade

		}
		leituraDados.close();
	}
}