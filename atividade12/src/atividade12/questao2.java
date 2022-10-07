package atividade12;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {

		Scanner leituraDados = new Scanner(System.in);
		boolean cordas, amplificador, teclas, bumbo;
		
		System.out.println("O instrumento tem cordas?");
		cordas = leituraDados.nextBoolean();

		if (cordas == true) {
			System.out.println("O instrumento tem amplificador?");
			amplificador = leituraDados.nextBoolean();

			if (amplificador == true) {
				System.out.println("O instrumento é uma guitarra");
			} else {
				System.out.println("O instrumento é um violão");
			}
		} else {
			System.out.println("O instrumento tem teclas?");
			teclas = leituraDados.nextBoolean();

			if (teclas == true) {
				System.out.println("O instrumento é um teclado");
			} else {

				System.out.println("O instrumento tem bumbo?");
				bumbo = leituraDados.nextBoolean();
				if (bumbo == true) {
					System.out.println("O instrumento é uma bateria");
				} else {
					System.out.println("Esse instrumento é novo para mim, tente novamente!");
				}
			}
		}

		leituraDados.close();
	}
}