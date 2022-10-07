package atividade10;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		Scanner leituraDados = new Scanner(System.in);

		int codigo;

		System.out.println("Digite o código de status:");
		codigo = leituraDados.nextInt();

		switch (codigo) {

		case 200:
			System.out.println("Esta requisição foi bem-sucedida.");
			break;
		case 201:
			System.out.println("A requisição foi bem-sucedida e um novo recurso foi criado como resultado.");
			break;
		case 202:
			System.out.println("A requisição foi recebida, mas nenhuma ação foi tomada sobre ela.");
			break;
		case 400:
			System.out.println(
					"Essa resposta significa que o servidor não entendeu a requisição pois está com uma sintaxe inválida.");
			break;
		case 401:
			System.out.println(
					"Embora o padrão HTTP especifique \"unauthorized\", semanticamente, essa resposta significa \"unauthenticated\". Ou seja, o cliente deve se autenticar para obter a resposta solicitada.");
			break;
		case 403:
			System.out.println(
					"O cliente não tem direitos de acesso ao conteúdo portanto o servidor está rejeitando dar a resposta.");
			break;
		case 404:
			System.out.println("O servidor não pode encontrar o recurso solicitado.");
			break;
		case 422:
			System.out.println(
					"A requisição está bem formada, mas inabilitada para ser seguida devido a erros semânticos.");
			break;
		case 500:
			System.out.println("O servidor encontrou uma situação com a qual não sabe lidar.");
			break;
		case 503:
			System.out.println("O servidor não está pronto para manipular a requisição.");
			break;
		case 504:
			System.out.println(
					"Esta resposta de erro é dada quando o servidor está atuando como um gateway e não obtém uma resposta a tempo.");
			break;
		default:
			System.out.println("A opção escolhida é inválida");
		}
		leituraDados.close();
	}
}