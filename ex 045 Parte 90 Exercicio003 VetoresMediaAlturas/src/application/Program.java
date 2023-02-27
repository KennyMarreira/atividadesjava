package application;

import java.util.Locale;
import java.util.Scanner;import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas: ");
		int n = sc.nextInt();
		Pessoa vect[] = new Pessoa[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new Pessoa(name, idade, altura);
		}
		
		double somaAltura = 0;
		for (int i = 0; i < vect.length; i++) {
			somaAltura += vect[i].getAltura();
		}
		
		double mediaAltura = somaAltura / vect.length;
		System.out.printf("Altura média: %.2f%n", mediaAltura);
		
		int somaIdade = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				somaIdade += 1;
			}
		}
		
		System.out.printf("Pessoas com menos de 16 anos: %d%n", somaIdade);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%n", (100 * somaIdade / Double.valueOf(n)));
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.println(vect[i].getName());
			}
		}
		
		sc.close();
	}

}
