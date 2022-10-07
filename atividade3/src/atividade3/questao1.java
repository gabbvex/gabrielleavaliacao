package atividade3;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		double primeiro, segundo, soma, subtracao, multiplicacao, divisao, cubo, raiz;

		Scanner leituraDados = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		primeiro = leituraDados.nextDouble();

		System.out.println("Digite o segundo número: ");
		segundo = leituraDados.nextDouble();

		soma = primeiro + segundo;
		subtracao = primeiro - segundo;
		multiplicacao = primeiro * segundo;
		divisao = primeiro / segundo;

		cubo = Math.pow(primeiro, 3);
		raiz = Math.sqrt(segundo);

		System.out.println("A soma dos números é: " + soma);
		System.out.println("A subtração dos números é: " + subtracao);
		System.out.println("A multiplicação dos números é: " + multiplicacao);
		System.out.println("A divisão dos números é: " + divisao);
		System.out.println("O cubo dos números é: " + cubo);
		System.out.println("A raiz dos números é: " + raiz);

		leituraDados.close();
	}

}