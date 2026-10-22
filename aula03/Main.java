package produtosAula05;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void cadastrarCliente(Scanner teclado, ArrayList<CadastroCliente> clientes) {
		//Scanner teclado = new Scanner(System.in);
		System.out.print("=== Cadastro de cliente ===  \n");
        System.out.print("Crie seu ID: ");
        String novoId = teclado.nextLine();
 
        boolean existe = false;

        for (CadastroCliente cliente : clientes) {
            if (cliente.getId().equals(novoId)) {
                existe = true;
                break;
            }
        }

        if (existe) {
            System.out.println("Esse ID já está cadastrado!");
        } else {
        	System.out.print("=== Cadastro de cliente === \n");
            System.out.print("Crie sua senha: ");
            String novaSenha = teclado.nextLine();

            CadastroCliente novoCliente =new CadastroCliente(novoId, novaSenha);
            clientes.add(novoCliente);
            System.out.println("Cadastro realizado!");
        }
	}
	public static void loginCliente(Scanner teclado, ArrayList<CadastroCliente> clientes) {
		if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
           
        }
        System.out.print("=== Login === \n");
        System.out.print("Digite seu ID: ");
        String idLogin = teclado.nextLine();

        System.out.print("Digite sua senha: ");
        String senhaLogin = teclado.nextLine();

        boolean logado = false;

        
        for (CadastroCliente cliente : clientes) {

            if (cliente.getId().equals(idLogin)
                    && cliente.getSenha().equals(senhaLogin)) {

                logado = true;
                break;
            }
        }

        if (logado) {
            System.out.println("Login realizado com sucesso!");
            //chamar o proximo menu
        } else {
            System.out.println("ID ou senha incorretos!");
            
        }
	}
	
	
	public static void main(String[] args) {
		
		ArrayList <Produtos> listaProdutos = new ArrayList<>();
		ArrayList<CadastroCliente> clientes = new ArrayList<>();
		boolean rodando = true;
		int opcao = 0;
		Scanner teclado = new Scanner(System.in);
		
		while (rodando) {
			 	System.out.println("=== SISTEMA DE CLIENTES ===");
	            System.out.println("1 - Cadastrar");
	            System.out.println("2 - Fazer login");
	            System.out.println("3 - Sair");
	            System.out.print("Escolha: ");

	            opcao = teclado.nextInt();
	            teclado.nextLine();

	            switch (opcao) {

	                case 1:
	                	cadastrarCliente(teclado, clientes);
	                    break;

	                case 2:
	                	loginCliente(teclado, clientes);
	                    break;

	                case 3:
	                    System.out.println("Sistema encerrado.");
	                    break;

	                default:
	                    System.out.println("Opção inválida!");
	            }

	        

	           /*
			System.out.println("\n===== MENU DA LOJA =====");
			System.out.println("1. Cadastrar Produto");
			System.out.println("2. Listar Produtos");
			System.out.println("3. Valor total do estoque");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opção: ");
			int opcao1 = teclado.nextInt();
			teclado.nextLine(); 

			if (opcao1 == 1) {
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

			} else if (opcao1 == 2) {
				if (listaProdutos.isEmpty()) {
					System.out.println("Nenhum produto cadastrado.");
				} else {
					System.out.println("Lista de Produtos:");
					for (Produtos p : listaProdutos) {
						p.exibirInformacoes();
						System.out.println("-------------------");
					}
				}

			} else if (opcao1 == 3) {
				double valorTotal = 0;
				for (Produtos p : listaProdutos) {
					valorTotal += p.calcularValorEstoque();
				}
				System.out.println("Valor total do estoque: R$" + valorTotal);

			} else if (opcao1 == 0) {
				rodando = false;
				System.out.println("Saindo do programa...");

			} else {
				System.out.println("Opção inválida. Tente novamente.");
			}
			*/
		}
	}
}

		
	
	
	


