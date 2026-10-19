package produtosAula05;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList <Produtos> listaProdutos = new ArrayList<>();
		boolean rodando = true;

		while (rodando) {
			System.out.println("\n===== MENU DA LOJA =====");
			System.out.println("1. Cadastrar Produto");
			System.out.println("2. Listar Produtos");
			System.out.println("3. Valor total do estoque");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opção: ");
			int opcao = teclado.nextInt();
			teclado.nextLine(); 

			if (opcao == 1) {
				System.out.print("Nome do produto: ");
				String nome = teclado.nextLine();

				System.out.print("Preço: ");
				double preco = teclado.nextDouble();

				System.out.print("Quantidade: ");
				int quantidade = teclado.nextInt();
				teclado.nextLine(); 

				Produtos novoProduto = new Produtos(nome, preco, quantidade);
				listaProdutos.add(novoProduto);

				System.out.println("Produto cadastrado com sucesso!");

			} else if (opcao == 2) {
				if (listaProdutos.isEmpty()) {
					System.out.println("Nenhum produto cadastrado.");
				} else {
					System.out.println("\nLista de Produtos:");
					for (Produtos p : listaProdutos) {
						p.exibirInformacoes();
						System.out.println("-------------------");
					}
				}

			} else if (opcao == 3) {
				double valorTotal = 0;
				for (Produtos p : listaProdutos) {
					valorTotal += p.calcularValorEstoque();
				}
				System.out.println("Valor total do estoque: R$" + valorTotal);

			} else if (opcao == 0) {
				rodando = false;
				System.out.println("Saindo do programa...");

			} else {
				System.out.println("Opção inválida. Tente novamente.");
			}
		}

		teclado.close();
	}
}