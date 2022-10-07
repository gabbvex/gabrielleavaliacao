package atividade3;

import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String firstName, lastName;

		System.out.println("Digite seu primeiro nome:");
		firstName = input.next();

		System.out.println("Digite seu segundo nome:");
		lastName = input.next();

		System.out.println("\nHello!");
		System.out.println(firstName + " " + lastName);

		input.close();

	}
}