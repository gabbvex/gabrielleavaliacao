package atividade4;

import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		Scanner leituraDados = new Scanner(System.in);
		String nome;

		int nota1, nota2, nota3;
		int media;

		System.out.println("Digite seu primeiro nome:");
		nome = leituraDados.next();

		System.out.println(nome + ", digite sua 1ª nota");
		nota1 = leituraDados.nextInt();

		System.out.println(nome + ", digite sua 2ª nota");
		nota2 = leituraDados.nextInt();

		System.out.println(nome + ", digite sua 3ª nota");
		nota3 = leituraDados.nextInt();

		media = (nota1 + nota2 + nota3) / 3;
		System.out.println("A média do aluno " + nome + " é " + media);

		if ((media >= 0) && (media < 4)) {
			System.out.println("Nota E");
		} else if (media < 5) {
			System.out.println("Nota D");
		} else if (media < 7) {
			System.out.println("Nota C");
		} else if (media < 8) {
			System.out.println("Nota B");
		} else if (media <= 10) {
			System.out.println("Nota A");
		}

		leituraDados.close();
	}
}