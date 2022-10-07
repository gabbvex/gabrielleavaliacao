package atividade12;

import java.util.Scanner;

public class questao1 {
	public static void main(String[] args) {

		Scanner leituraDados = new Scanner(System.in);
		System.out.println("Digite a data estabelecida.");
		String data = leituraDados.next();

		System.out.println("Digite a hora estabelecida (sem formatação).");
		int hora = leituraDados.nextInt();

		switch (data) {

		case "27/09":

			if (hora <= 900 ) { // coloquei um .startsWith por todos os horarios dessa condição começarem com 0
				System.out.println(
						"A temperatura do dia: " + data + " é de: 21°C e o tempo é de: Pancadas leves de chuva.");
			} else if (hora <= 1400 ) {
				System.out.println("A temperatura do dia: " + data + " é de: 20°C e o tempo é de: Pancadas de chuva.");
			} else if (hora <= 2359 ) {
				System.out.println("A temperatura do dia: " + data
						+ " é de: 22°C e o tempo é de: Tempestades isoladas com raios e trovões.");
			} else {
				System.out.println("Dia e hora não disponíveis.");
			}
			break;
		case "28/09":
			if (hora <= 1100 ) {
				System.out.println("A temperatura do dia: " + data + " é de: 21°C e o tempo é de: Sol.");
			} else if (hora <= 1700 ) {
				System.out
						.println("A temperatura do dia: " + data + " é de: 26°C e o tempo é de: Parcialmente nublado.");
			} else if (hora <= 2359 ) {
				System.out.println("A temperatura do dia: " + data + " é de: 22°C e o tempo é de: Sol.");
			} else {
				System.out.println("Dia e hora não disponíveis.");
			}
			break;
		}
		leituraDados.close();
	}
}