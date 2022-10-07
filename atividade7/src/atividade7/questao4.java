package atividade7;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		Scanner leituraDados = new Scanner(System.in);
		System.out.println("Escolha o número de um mês:");
		int meses = leituraDados.nextInt();

		System.out.println("Escolha um dia do mês:");
		int day = leituraDados.nextInt();

		String monthString = "";
		switch (meses) {
		case 1:
			monthString = "Janeiro";
			System.out.println("É verão!");
			break;

		case 2:
			monthString = "Fevereiro";
			System.out.println("É verão!");
			break;

		case 3:
			monthString = "Março";
			if (day <= 20) {
				System.out.println("É verão!");
			} else {
				System.out.println("É outono!");
			}
			break;

		case 4:
			monthString = "Abril";
			System.out.println("É outono!");
			break;

		case 5:
			monthString = "Maio";
			System.out.println("É outono!");
			break;

		case 6:
			monthString = "Junho";
			if (day <= 21) {
				System.out.println("É outono!");
			} else {
				System.out.println("É inverno!");
			}
			break;

		case 7:
			monthString = "Julho";
			System.out.println("É inverno!");
			break;

		case 8:
			monthString = "Agosto";
			System.out.println("É inverno!");
			break;

		case 9:
			monthString = "Setembro";
			if (day <= 21) {
				System.out.println("É inverno!");
			} else {
				System.out.println("É primavera!");
			}
			break;

		case 10:
			monthString = "Outubro";
			System.out.println("É primavera!");
			break;

		case 11:
			monthString = "Novembro";
			System.out.println("É primavera!");
			break;

		case 12:
			monthString = "Dezembro";
			if (day <= 22) {
				System.out.println("É primavera!");
			} else {
				System.out.println("É verão!");
			}
			break;

		default:
			System.out.println("Mês invalido!");
		}
		// Printing month of the given number
		System.out.println(monthString);
		leituraDados.close();
	}
}