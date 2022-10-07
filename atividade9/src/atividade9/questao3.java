package atividade9;

import java.util.Scanner;

public class questao3 {
	public static void main(String[] args) {

		Scanner leituraDados = new Scanner(System.in);
		
		System.out.println("Bem vindo! Aqui está nosso cardápio:");
		System.out.println("----------------- Cardápio ----------------- ");
		System.out.println("DOCES");
		System.out.println("MASSAS");
		System.out.println("SOPAS");
		System.out.println("PIZZAS");
		System.out.println("BEBIDAS");
		System.out.println("--------------------------------------------");
		
		
		
		System.out.println("Digite sua preferência:");
		String comida = leituraDados.next();

		switch (comida) {

		case "DOCES":
			System.out.println("-------------------DOCES--------------------");
			System.out.println("Brigadeiro");
			System.out.println("Beijinho");
			System.out.println("Sorvete");
			System.out.println("Brownie");
			System.out.println("Cocada");
			System.out.println("--------------------------------------------");
			break;
		case "MASSAS":
			System.out.println("-------------------MASSAS-------------------");
			System.out.println("Macarrão alho e óleo");
			System.out.println("--------------------------------------------");
			break;
		case "SOPAS":
			System.out.println("-------------------SOPAS--------------------");
			System.out.println("De legumes");
			System.out.println("--------------------------------------------");
			break;
		case "PIZZAS":
			System.out.println("-------------------PIZZAS-------------------");
			System.out.println("Moda");
			System.out.println("Calabresa");
			System.out.println("Frango com catupiry");
			System.out.println("--------------------------------------------");
			break;
		case "BEBIDAS":
			System.out.println("------------------BEBIDAS-------------------");
			System.out.println("Cerveja");
			System.out.println("Refrigerante");
			System.out.println("Água");
			System.out.println("Suco");
			System.out.println("--------------------------------------------");
			break;
		default:
			System.out.println("A opção escolhida é inválida");
		}
		leituraDados.close();
	}
}	