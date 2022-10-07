package atividade10;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		Scanner leituraDados = new Scanner(System.in);

		int codigo;

		System.out.println("Digite o código de status:");
		codigo = leituraDados.nextInt();

		if (codigo < 200) {
			System.out.println("Respostas de informação");
		} else if (codigo < 300) {
			System.out.println("Respostas de sucesso");
		} else if (codigo < 400) {
			System.out.println("Redirecionamentos");
		} else if (codigo < 500) {
			System.out.println("Erros do cliente");
		} else if (codigo < 600) {
			System.out.println("Erros do servidor");
		} else {
			System.out.println("Código de status inválido");
		}
		leituraDados.close();
	}
}