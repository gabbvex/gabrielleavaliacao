package atividade14;

public class questao1 {

	public static void main(String[] args) {
		
		int linhas = 8;
		int horizontal, borda;
		
		for (horizontal = 0; horizontal < linhas; horizontal++) {
			for (borda = 1; borda <= linhas; borda++) {
				if ((borda == 1 && horizontal != 0 && horizontal != linhas - 1)
						|| ((horizontal == 0 || horizontal == linhas - 1) && borda > 1 && borda < linhas - 2)
						|| (horizontal == ((linhas - 1) / 2) && borda > 2 && borda < linhas - 1) || (borda == linhas - 2
								&& horizontal != 0 && horizontal >= ((linhas - 1) / 2) && horizontal != linhas - 1))
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		}

	}
}