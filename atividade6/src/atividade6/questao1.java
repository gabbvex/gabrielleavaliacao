package atividade6;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		double valor, codigo, porcentagem, valordesconto, valortotal, parcelado;
		try (Scanner leituraDados = new Scanner(System.in)) {
			System.out.println("Digite o preço: ");
			valor = leituraDados.nextDouble();

			System.out.println("Digite o código: ");
			codigo = leituraDados.nextDouble();
		}

		if (codigo == 1) {
			porcentagem = 5;
			valordesconto = (porcentagem * valor) / 100;
			valortotal = (valor - valordesconto);
			System.out.println("o valor da sua compra é: " + valor + " E com desconto de: " + valordesconto
					+ " O valor total é de: " + valortotal);

		} else if (codigo == 2) {
			porcentagem = 10;
			valordesconto = (porcentagem * valor) / 100;
			valortotal = (valor - valordesconto);
			System.out.println("o valor da sua compra é: " + valor + " E com desconto de: " + valordesconto
					+ " O valor total é de: " + valortotal);

		} else if (codigo == 3) {
			parcelado = (valor) / 2;
			System.out.println("o valor da sua compra é: " + valor + " Parcelado em duas vezes de: " + parcelado);

		} else if (codigo == 4) {
			porcentagem = 10;
			valordesconto = (porcentagem * valor) / 100;
			valortotal = (valor + valordesconto);
			parcelado = (valortotal) / 2;
			System.out.println("o valor da sua compra é: " + valor + " E com juros de: " + valordesconto
					+ " Parcelado em duas vezes de: " + parcelado);

		} else if (codigo == 5) {
			porcentagem = 5;
			valordesconto = (porcentagem * valor) / 100;
			valortotal = (valor - valordesconto);
			System.out.println("o valor da sua compra é: " + valor + " E com desconto de: " + valordesconto
					+ " O valor total é de: " + valortotal);

		} else if (codigo == 6) {
			porcentagem = 8;
			valordesconto = (porcentagem * valor) / 100;
			valortotal = (valor - valordesconto);
			System.out.println("o valor da sua compra é: " + valor + " E com desconto de: " + valordesconto
					+ " O valor total é de: " + valortotal);
		}
	}
}