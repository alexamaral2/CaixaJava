package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CaixaEletronico;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		CaixaEletronico caixa = new CaixaEletronico();
		int opcao;

		do {
			System.out.println("\n--- Menu do Caixa Eletrônico ---");
			System.out.println("1. Abastecer Caixa");
			System.out.println("2. Sacar");
			System.out.println("3. Exibir Saldo");
			System.out.println("4. Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Quantidade de notas de 100 a adicionar: ");
				int qtd100 = scanner.nextInt();
				caixa.adicionarNota100(qtd100);

				System.out.print("Quantidade de notas de 50 a adicionar: ");
				int qtd50 = scanner.nextInt();
				caixa.adicionarNota50(qtd50);

				System.out.print("Quantidade de notas de 20 a adicionar: ");
				int qtd20 = scanner.nextInt();
				caixa.adicionarNota20(qtd20);

				System.out.print("Quantidade de notas de 10 a adicionar: ");
				int qtd10 = scanner.nextInt();
				caixa.adicionarNota10(qtd10);

				System.out.print("Quantidade de notas de 5 a adicionar: ");
				int qtd5 = scanner.nextInt();
				caixa.adicionarNota5(qtd5);

				System.out.print("Quantidade de notas de 2 a adicionar: ");
				int qtd2 = scanner.nextInt();
				caixa.adicionarNota2(qtd2);

				break;

			case 2:
				System.out.print("Digite o valor para saque: ");
				int valor = scanner.nextInt();
				caixa.sacar(valor);
				break;

			case 3:
				System.out.println(caixa.toString());
				break;

			case 4:
				System.out.println("Saindo...");
				break;

			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;
			}
		} while (opcao != 4);

		scanner.close();
	}
}
