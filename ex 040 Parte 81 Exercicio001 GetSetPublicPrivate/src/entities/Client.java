package entities;

public class Client {
	
	private int conta;
	private String titular;
	private double saldo;
	
	public Client(int conta, String titular, double depositoInicial) {
		this.conta = conta;
		this.titular = titular;
		deposito(depositoInicial);
	}
	
	public Client(int conta, String titular) {
		this.conta = conta;
		this.titular = titular;
	}
	
	
	public int getConta() {
		return conta;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	
	public void deposito(double valor) {
		this.saldo = saldo + valor;
	}
	
	public void saque(double valor) {
		this.saldo = saldo - valor - 5.00;
	}
	
	public String toString() {
		return "Account: "
				+ conta
				+ ", Titular: "
				+ titular
				+", Saldo: $ "
				+ String.format("%.2f", saldo);
	}

}
