package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Quarto;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Quarto vect[] = new Quarto[10];
		
		System.out.print("Digite a quantidade de quartos alugados: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Aluguel %d#:%n", i+1);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("E-mail: ");
			String email = sc.next();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vect[quarto] = new Quarto(nome, email, quarto);
		}
		System.out.println();
		System.out.println("Quartos alugados:");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.printf("#%s%n", vect[i].toString());
			}
		}
		
		
		sc.close();
	}

}
