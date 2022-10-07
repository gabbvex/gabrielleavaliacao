package atividade5;

import java.util.Scanner;

	public class questao3 {

		public static void main(String[] args) {
	       System.out.print("Digite o valor de A: ");
	       Scanner valorA = new Scanner (System.in);
	       int a = valorA.nextInt();
	       
	       System.out.print("Digite o valor de B: ");
	       Scanner valorB = new Scanner (System.in);
	       int b = valorB.nextInt();
	       
	       System.out.print("Digite o valor de C: ");
	       Scanner valorC = new Scanner (System.in);
	       int c = valorC.nextInt();
	       
	           if (a == b){
	    	       int resultado = (a+b) - c;
	    			System.out.println("O resultado da soma de A mais B menos C é " + resultado);
	           }
	           else if (a != b){
	    	       int resultado = (a*b) - c;
	    			System.out.println("O resultado da multiplicação de A mais B menos C é " + resultado);
	           }
	   }
	}