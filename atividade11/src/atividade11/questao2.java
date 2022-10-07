package atividade11;

import java.util.Scanner;

public class questao2 {
	public static void main(String[] args) {

		Scanner leituraDados = new Scanner(System.in);
		String prato1, prato2;
		int calorias1, calorias2;
		System.out.println("Escolha o primeiro prato:");
		prato1 = leituraDados.next();

		System.out.println("Escolha o segundo prato:");
		prato2 = leituraDados.next();

		switch (prato1) {
		case "Empada":
			calorias1 = 250;
			break;
		case "Sorvete":
			calorias1 = 110;
			break;
		case "Mousse":
			calorias1 = 170;
			break;
		case "Suco":
			calorias1 = 70;
			break;
		case "Refrigerante":
			calorias1 = 200;
			break;
		default:
			calorias1 = 0;
		}

		switch (prato2) {
		case "Empada":
			calorias2 = 250;
			break;
		case "Sorvete":
			calorias2 = 110;
			break;
		case "Mousse":
			calorias2 = 170;
			break;
		case "Suco":
			calorias2 = 70;
			break;
		case "Refrigerante":
			calorias2 = 200;
			break;
		default:
			calorias2 = 0;
		}
		System.out.println("A quantidade de calorias é: " + (calorias1 + calorias2));
		leituraDados.close();
	}
}
