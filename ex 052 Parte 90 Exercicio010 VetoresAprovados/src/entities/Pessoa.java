package entities;

public class Pessoa {
	
	private String nome;
	private double nota1;
	private double nota2;
	
	public Pessoa(String nome, double nota1, double nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public String getNome() {
		return nome; 
	}
	
	public double getMedia() {
		return (nota1 + nota2) / 2;
	}

}
