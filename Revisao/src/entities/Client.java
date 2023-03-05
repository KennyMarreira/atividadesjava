package entities;

public class Client {

	private Integer id;
	private String nome;
	private Double salario;
	
	public Client(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public int getId() {
		return id;
	}
	
	public void getAumento(double aumento) {
		salario += salario * aumento / 100;
	}
	
	public String toString() {
		return "ID: " 
				+ String.format("%d%n", id) 
				+ "Nome: " 
				+ String.format("%s%n", nome) 
				+ "Salario: $" 
				+ String.format("%.2f%n", salario);
	}
	
	
	
}
