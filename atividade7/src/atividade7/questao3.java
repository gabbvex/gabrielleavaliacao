package atividade7;

import java.util.Scanner;

public class questao3 {
	 public static void main(String[] args) {
		  Scanner leituraDados = new Scanner(System.in);
			String nome;
			
			int nota1, nota2, nota3, nota4;
			int media;

			System.out.println("Digite seu primeiro nome:");
			nome = leituraDados.next();
		  
			System.out.println(nome + ", digite sua 1ª nota");
			nota1 = leituraDados.nextInt();

			System.out.println(nome + ", digite sua 2ª nota");
			nota2 = leituraDados.nextInt();

			System.out.println(nome + ", digite sua 3ª nota");
			nota3 = leituraDados.nextInt();

			System.out.println(nome + ", digite sua 4ª nota");
			nota4 = leituraDados.nextInt();
			
			media = (int) Math.ceil((nota1 + nota2 + nota3 + nota4) / 4);
			System.out.println("A média do aluno " + nome + " é " + media);
		  
		   switch (media) {
		     case 1:
		       System.out.println("Está Reprovado");
		       break;
		     case 2:
		       System.out.println("Está Reprovado");
		       break;
		     case 3:
		       System.out.println("Está Reprovado");
		       break;
		     case 4:
		       System.out.println("Está Reprovado");
		       break;
		     case 5:
		       System.out.println("Recuperação");
		       break;
		     case 6:
		       System.out.println("Aprovado");
		       break;
		     case 7:
		       System.out.println("Aprovado");
		       break;
		     case 8:
		       System.out.println("Aprovado");
		       break;
		     case 9:
		       System.out.println("Aprovado");
		       break;
		     case 10:
		       System.out.println("Aprovado");
		       break;
		     default:
		       System.out.println("Não existe uma nota correspondente aos números escolhidos! Digite um notas entre 1 a 10.");
		    }
			leituraDados.close();
		}
}
