package atividade9;

import java.util.Scanner;

public class questao2 {

	  public static void main(String[] args) {

		    char operator;
		    Double numero1, numero2, result;


		    Scanner leituraDados = new Scanner(System.in);


		    System.out.println("Escolha uma operação entre: +, -, *, ou /");
		    operator = leituraDados.next().charAt(0);


		    System.out.println("Digite o primeiro número");
		    numero1 = leituraDados.nextDouble();

		    System.out.println("Digite o segundo número");
		    numero2 = leituraDados.nextDouble();

		    switch (operator) {

		      case '+':
		        result = numero1 + numero2;
		        System.out.println(numero1 + " + " + numero2 + " = " + result);
		        break;

		      case '-':
		        result = numero1 - numero2;
		        System.out.println(numero1 + " - " + numero2 + " = " + result);
		        break;

		      case '*':
		        result = numero1 * numero2;
		        System.out.println(numero1 + " * " + numero2 + " = " + result);
		        break;

		      case '/':
		        result = numero1 / numero2;
		        System.out.println(numero1 + " / " + numero2 + " = " + result);
		        break;

		      default:
		        System.out.println("A opção não existe no momento!");
		        break;
		    }

		    leituraDados.close();
		  }
		}