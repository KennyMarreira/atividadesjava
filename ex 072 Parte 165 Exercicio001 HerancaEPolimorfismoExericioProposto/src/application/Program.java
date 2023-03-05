package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> list = new ArrayList<>();
		
		System.out.print("Digite o numero de contribuintes: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Contribuinte #" + i + ":");
			System.out.print("Pessoa Física ou Juridica: (f/j)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda Anual: ");
			double rendaAnual = sc.nextDouble();
			if (ch == 'f') {
				System.out.print("Despesas com saúde: ");
				double despesaSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, despesaSaude));
			}
			else {
				System.out.print("Numero de funcionarios: ");
				int funcionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, funcionarios));
			}
		}
		
		System.out.println();
		System.out.println("Taxas pagas:");
		for (Contribuinte cont : list) {
			System.out.println(cont.getNome() + ": $ " + String.format("%.2f", cont.taxaPaga()));
		}
		System.out.println();
		System.out.println("Total Pago:");
		double soma = 0.0;
		for (Contribuinte cont : list) {
			soma += cont.taxaPaga();
		}
		System.out.println(String.format("%.2f", soma));
		
		sc.close();
	}

}
