package atividade4;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		Scanner leituraDados = new Scanner(System.in);
		char letra;

		System.out.println("Digite uma letra:");
		letra = (char) leituraDados.next().charAt(0);

		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.println(" é uma Vogal");
		} else
			System.out.println(" é uma Consoante");

		leituraDados.close();
	}
}