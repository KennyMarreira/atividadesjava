package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Client client;
		
		System.out.print("Digite o numero da conta: ");
		int conta = sc.nextInt();
		System.out.print("Digite o titular da conta: ");
		sc.nextLine();
		String titular = sc.next();
		System.out.print("Adicionar deposito inicial (y/n)? ");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 'y') {
			System.out.print("Deposito inicial: ");
			double depositoInicial = sc.nextDouble();
			client = new Client(conta, titular, depositoInicial);
		}
		else {
			client = new Client(conta, titular);
		}
		
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(client);
		
		System.out.println();
		System.out.print("Entre o deposito: ");
		double valor = sc.nextDouble();
		client.deposito(valor);
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(client);
				
		System.out.println();
		System.out.print("Digite o saque: ");
		valor = sc.nextDouble();
		client.saque(valor);
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(client);
		
		
		sc.close();
	}

}
