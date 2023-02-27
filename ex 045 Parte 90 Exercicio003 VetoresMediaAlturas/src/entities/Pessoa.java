package entities;

public class Pessoa {
	
	private String name;
	private int idade;
	private double altura;
	
	public Pessoa (String name, int idade, double altura) {
		this.name = name;
		this.idade = idade;
		this.altura = altura;
	}
	
	public String getName() {
		return name;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public double getIdade() {
		return idade;
	}

}
