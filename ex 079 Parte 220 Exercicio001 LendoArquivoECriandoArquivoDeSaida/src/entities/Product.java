package entities;

public class Product {

	String nome;
	double preco;
	int quantidade;
	
	public Product() {
		
	}

	public Product(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}


	public int getQuantidade() {
		return quantidade;
	}

	public double valorTotal() {
		return preco * quantidade;
	}
	
	public String toString() {
		return nome + " " + valorTotal();
	}

}
