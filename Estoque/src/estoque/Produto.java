package estoque;

import java.util.Scanner;

public class Produto {
	//Atributos do produto
	
	private int idProduto;
	private String nome;
	private double preco;
	private int quantidade;
	private boolean estado;

	
	//construtores
	
	/* Esta forma de montar um construtor não é um jeito correto de fazer. 
    Apesar de funcionar, fere as boas práticas de programação orientada à objetos */
	
	/*public Produto() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o Id do produto");
		this.idProduto = in.nextInt();
		in.nextLine();
		
		System.out.println("Digite o nome do produto");
		this.nome = in.nextLine();
	
		System.out.println("Digite o preço do produto");
		this.preco = in.nextDouble();
		
		System.out.println("Digite a quantidade do produto em estoque");
		this.quantidade = in.nextInt();
		
		System.out.println("Digite o estado do produto");
		this.estado = in.nextBoolean();
		
	}*/
	
	public Produto(int idProduto, String nome, double preco, int quantidade, boolean estado) {
		this.idProduto = idProduto;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.estado = estado;
	}
	
	public Produto(int idProduto, int quantidade, String nome, double preco) {
		this.idProduto = idProduto;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.estado = estado;
	}
	
	public Produto() {
		
	}
	
	
	// métodos get and set
	
	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade
				+ ", status do produto = " + (estado?"Ativo": "Descontinuado") + "]";
	}

}


