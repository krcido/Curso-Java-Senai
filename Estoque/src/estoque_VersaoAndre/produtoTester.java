package estoque_VersaoAndre;
import java.util.ArrayList;
import java.util.Scanner;


public class produtoTester {
	
	private static ArrayList<Produto> listaProdutos;
	private static Scanner scanner;

	public static void main(String[] args) {
		int opcao;
		scanner = new Scanner(System.in);
		listaProdutos = new ArrayList<Produto>();
		
		// Produtos iniciais =)
		listaProdutos.add(new Produto(10, "Mouse", 25.99, 10, true));
		listaProdutos.add(new Produto(11, "Teclado", 45.00, 8, true));
		listaProdutos.add(new Produto(12, "Headphone", 129.90, 12, true));
		 
		do {
			opcao = menu();
			switch (opcao) {
				case 1:
					cadastrar();
					break;
				case 2:
					adicionar();
					break;
				case 3:
					remover();
					break;
				case 4:
					modificar();
					break;
				case 5:
					listar();
					break;
			}
			
		} while(opcao != 6);
		
	}

	public static int menu() {
		int opcao;
		System.out.println("\n**** Controle de Inventário ****");
		System.out.println("1. Cadastrar");
		System.out.println("2. Adicionar quantidade");
		System.out.println("3. Remover quantidade");
		System.out.println("4. Modificar");
		System.out.println("5. Listar");
		System.out.println("6. Encerrar Programa");
		
		System.out.print("Informe uma opção: ");
		
		try {		
			opcao = scanner.nextInt();
		} catch (Exception e) {
			System.err.println("Valor inválido!");
			opcao = 0;
		}
		clearCache();
		return opcao;
	}
	
	public static void clearCache() {
		if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
	}
	
	public static void cadastrar() {

		Produto produto;
		int idProduto;
		String nome;
		double preco;
		int quantidade;
		boolean estado;

		try {
			System.out.print("Informe o número do Produto: ");
			idProduto = scanner.nextInt();
			clearCache();

			System.out.print("Informe o nome do Produto: ");
			nome = scanner.next();
			clearCache();

			System.out.print("Informe a quantidade do Produto: ");
			quantidade = scanner.nextInt();
			clearCache();

			System.out.print("Informe o preço do Produto: ");
			preco = scanner.nextDouble();
			clearCache();

			System.out.print("Informe o status do Produto: ");
			estado = scanner.nextBoolean();
			clearCache();
			
		} catch (Exception e) {
			System.err.println("Erro nos valores digitados, tente novamente!");
			return;
		}
		
		produto = new Produto(idProduto, nome);
		produto.setQuantidade(quantidade);
		produto.setPreco(preco);
		produto.setEstado(estado);
		
		listaProdutos.add(produto);
		
	}

	private static void adicionar() {

		int idProduto;
		int quantidade;

		try {
			System.out.print("Informe o número do Produto: ");
			idProduto = scanner.nextInt();
			clearCache();

			System.out.print("Informe a quantidade do Produto: ");
			quantidade = scanner.nextInt();
			clearCache();
			
		} catch (Exception e) {
			System.err.println("Erro nos valores digitados, tente novamente!");
			return;
		}
		
		for (Produto produto : listaProdutos) {
			if (produto.getIdProduto() == idProduto) {
				produto.setQuantidade(produto.getQuantidade() + quantidade);
				System.out.println("Quantidade adicionada com sucesso!");
				return;
			}
		}
		System.err.println("Produto não encontrado!");
	}


	private static void remover() {
		int idProduto;
		int quantidade;

		try {
			System.out.print("Informe o número do Produto: ");
			idProduto = scanner.nextInt();
			clearCache();

			System.out.print("Informe a quantidade do Produto que deseja excluir: ");
			quantidade = scanner.nextInt();
			clearCache();
			
		} catch (Exception e) {
			System.err.println("Erro nos valores digitados, tente novamente!");
			return;
		}
		
		for (Produto produto : listaProdutos) {
			if (produto.getIdProduto() == idProduto) {
				produto.setQuantidade(produto.getQuantidade() - quantidade);
				System.out.println("Quantidade adicionada com sucesso!");
				return;
			}
		}
		System.err.println("Produto não encontrado!");
	}
		
	
	private static void modificar() {
		
		int idProduto;
		int opcao;

		try {
			System.out.print("Informe o número do Produto: ");
			idProduto = scanner.nextInt();
			clearCache();
			
		} catch (Exception e) {
			System.err.println("Erro nos valores digitados, tente novamente!");
			return;
		}
		
		for (Produto produto : listaProdutos) {
			if (produto.getIdProduto() == idProduto) {
				
				opcao = menuAlterar();
				
				switch (opcao) {
					case 1:
						System.out.print("Informe o novo nome do Produto: ");
						produto.setNome(scanner.next());
						break;
					case 2:
						System.out.print("Informe o novo preço do Produto: ");
						produto.setPreco(scanner.nextDouble());
						break;
					case 3:
						System.out.print("Informe a nova quantidade do Produto: ");
						produto.setQuantidade(scanner.nextInt());
						break;
					case 4:
						System.out.print("Informe o no estado do Produto: ");
						produto.setEstado(scanner.nextBoolean());
						break;
					case 5:
						menu();
						break;
				}
				System.out.println("Quantidade adicionada com sucesso!");
				return;
			}
		}
		System.err.println("Produto não encontrado!");
	
	}
	
	private static int menuAlterar() {
		
		int opcao;
		System.out.println("\n**** Escolha uma opção ****");
		System.out.println("1. Mudar nome");
		System.out.println("2. Mudar preço");
		System.out.println("3. Mudar quantidade");
		System.out.println("3. Mudar estado");
		System.out.println("4. Voltar");
		
		System.out.print("Informe uma opção: ");
		
		try {		
			opcao = scanner.nextInt();
		} catch (Exception e) {
			System.err.println("Valor inválido!");
			opcao = 0;
		}
		clearCache();
		return opcao;
		
	}
	
	public static void listar() {
		System.out.println("\n Relação de produtos");
		for (Produto produto : listaProdutos) {
			System.out.println(produto.toString() + "\n");
		}
		
		/*
		for (int i=0; i< listaProdutos.size(); i++) {
			Product produto = listaProdutos.get(i); 
			System.out.println(produto.toString() + "\n");
		}
		*/
	}
	
}
