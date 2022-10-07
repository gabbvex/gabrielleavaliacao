package atividade6;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		Scanner leituraDados = new Scanner(System.in);
		String nome;

		int nota1, nota2, nota3, nota4;
		double media;

		System.out.println("Digite seu primeiro nome:");
		nome = leituraDados.next();

		System.out.println(nome + ", digite sua 1ª nota");
		nota1 = leituraDados.nextInt();

		System.out.println(nome + ", digite sua 2ª nota");
		nota2 = leituraDados.nextInt();

		System.out.println(nome + ", digite sua 3ª nota");
		nota3 = leituraDados.nextInt();

		System.out.println(nome + ", digite sua 4ª nota");
		nota4 = leituraDados.nextInt();
		
		media = Math.ceil((nota1 + nota2 + nota3 + nota4) / 4);
		System.out.println("A média do aluno " + nome + " é " + media);
		
		if (media < 5){
			System.out.println("Está Reprovado");
		} else if (media == 5) {
			System.out.println("Recuperação");
		} else
			System.out.println("Aprovado");
		
		leituraDados.close();
	}

}
