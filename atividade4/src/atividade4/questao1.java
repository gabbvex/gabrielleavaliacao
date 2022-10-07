package atividade4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.GregorianCalendar;

public class questao1 {

	public static void main(String args[]) {
		InputStreamReader ins = new InputStreamReader(System.in);
		BufferedReader hey = new BufferedReader(ins);

		try {

			System.out.println("Digite o ano de seu nascimento:"); // guarda o ano de nascimento
			String year = hey.readLine();

			GregorianCalendar now = new GregorianCalendar();

			int bYear = Integer.parseInt(year);

			int nowYear;

			int age;

			nowYear = now.get(GregorianCalendar.YEAR); // ano atual

			age = nowYear - bYear;// faz a combinação pra encontrar a idade
			System.out.println("Você tem " + age + " anos. ");

			if (age>=18) {
				System.out.println("Você é maior de idade!");
			} else {
				System.out.println("Você é menor de idade!");
			}

		} catch (IOException err) {
			System.out.println("");
		}
	}
}