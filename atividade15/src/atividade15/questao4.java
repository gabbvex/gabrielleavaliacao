package atividade15;

import java.util.Scanner;

public class questao4 {

    public static void main(String[] args){
    	Scanner leituraDados = new Scanner(System.in);
    	
            int base; 
            int power;
            int result = 1;
            
            System.out.println("Informe a base:");
	        base = leituraDados.nextInt();
	        System.out.println("Informe o expoente:");
	        power = leituraDados.nextInt();
      
            for (int i = power; i != 0; i--) {
                result = result * base;
            }
            

            System.out.println(+ result);
            leituraDados.close();
        } 
    }