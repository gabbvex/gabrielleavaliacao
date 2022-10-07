package atividade7;

import java.util.Scanner;

public class questao2 {
	public static void main(String[] args) {

		Scanner leituraDados = new Scanner(System.in);
		System.out.println("Escolha um animal:");

		String animal = leituraDados.next();

		switch (animal) {

		case "Gato":
			System.out.println("Miau");
			break;
		case "Cachorro":
			System.out.println("Au Au");
			break;
		case "Pato":
			System.out.println("Qua Qua ");
			break;
		default:
			System.out.println("O animal escolhido é invalido! Escolha entre Gato, Cachorro e Pato.");
		}
		leituraDados.close();
	}
}