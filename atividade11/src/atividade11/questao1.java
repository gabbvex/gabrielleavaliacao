package atividade11;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {

		Scanner leituraDados = new Scanner(System.in);
		
		String prato1;
		

		System.out.println("Escolha um prato:");
		prato1 = leituraDados.nextLine();

		
		if (prato1.equals ("Empada")) {
			System.out.println("você escolheu a empada e ela tem 250 Kcal.");
		} else if (prato1.equals ("Sorvete")) {
			System.out.println("você escolheu o sorvete e ele tem 110 Kcal.");
		} else if (prato1.equals ("Mousse")) {
			System.out.println("você escolheu o mousse e ele tem 170 Kcal.");
		} else if (prato1.equals ("Suco")) {
			System.out.println("você escolheu o suco e ele tem 70 Kcal.");
		} else if (prato1.equals ("Refrigerante")) {
			System.out.println("você escolheu o refrigerante e ele tem 200 Kcal.");
		} else {
			System.out.println("O prato que você escolheu não está disponível. Tente novamente!");
		}
		
		leituraDados.close();
	}
}
