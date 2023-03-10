package entities;

public class Employee {
	
	private Integer id;
	private String nome;
	private Double salario;
	
	public Employee(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public int getId() {
		return id;
	}
	
	
	
	public void setId(Integer id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void getAumento(double aumento) {
		salario += salario * aumento/100;
	}
	
	public String toString() {
		return "Id: "
				+ id
				+ String.format(", %s ", nome)
				+", Salario: $ "
				+ String.format("%.2f", salario);
	}
}
