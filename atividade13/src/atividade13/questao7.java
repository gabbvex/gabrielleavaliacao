package atividade13;

public class questao7 {
	public static void main(String[] args) {

		int linhas = 4;

		for (int horizontal = 1; horizontal <= linhas; horizontal++) {
			if (horizontal == 1 || horizontal == linhas || horizontal == linhas) {
				for (int borda = 1; borda <= linhas; borda++) {
					if (borda == 1 || borda == linhas)
						System.out.print(" ");
					else
						System.out.print("*");
				}
			} else {
				for (int coluna = 1; coluna <= linhas; coluna++) {
					if (coluna == 1 || coluna == linhas)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}