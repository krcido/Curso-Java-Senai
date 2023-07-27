package estoque;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Produtotester {

	public static void main(String[] args) {
		int tempIdProduto = 0;
		int tempQuantidade = 0;
		String tempNome = " ";
		double tempPreco = 0.0;
		int maxSize = -1;
		
		Scanner in = new Scanner(System.in);
		
		do {
			try {
				System.out.println("Insira o número de produtos que gostaria de adicionar");
				System.out.println("Insira 0 (zero) se não quiser adicionar produtos:");
				maxSize = in.nextInt();
				if(maxSize<0)
					throw new Exception();
			}
			catch(InputMismatchException e) {
				in.nextLine();
				System.err.println("Tipo incorreto de dados inserido!");
			}
			catch(Exception e) {
				in.nextLine();
				System.err.println("O numero de produtos não pode ser negativo!");
			}
		}while(maxSize<0);
		
		if(maxSize == 0) {
			System.out.println("Não há produtos!");
		}
		else{
			Produto [] produtos = new Produto[maxSize];
			
			for(int i=0;i<maxSize;i++) {
				
				tempIdProduto = 0;
				tempQuantidade = 0;
				tempNome = " ";
				tempPreco = 0.0;
				
				try {
					in.nextLine();
					System.out.println("Digite o Id do produto "+ (i+1) +":");
					tempIdProduto = in.nextInt();
					in.nextLine();
					System.out.println("Digite a quantidade do produto "+ (i+1) +":");
					tempQuantidade = in.nextInt();
					in.nextLine();
					System.out.println("Digite o nome do produto "+ (i+1) +":");
					tempNome = in.nextLine();
					System.out.println("Digite o preço do produto "+ (i+1) +":");
					tempPreco= in.nextDouble();
				}
				catch (Exception e) {
					System.err.println("Tipo incorreto de dado inserido!");
				}
				produtos[i] = new Produto(tempIdProduto, tempQuantidade, tempNome, tempPreco);
			}
			in.close();
			
			for (Produto p : produtos) {
				System.out.println(p);
			}// fim for
			
		}//fim else
	}// fim main
}//fim classe
