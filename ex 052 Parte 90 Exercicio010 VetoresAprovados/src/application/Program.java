package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados: ");
		int n = sc.nextInt();
		Pessoa vect[] = new Pessoa[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Digite o nome e as notas do %d aluno:%n", i+1);
			sc.nextLine();
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			vect[i] = new Pessoa(nome, nota1, nota2);
		}
		
		String aprovado = "";
		System.out.println("Aprovados:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getMedia() >= 6.0) {
				aprovado = vect[i].getNome();
				System.out.println(aprovado);
			}
		}
		
		
		sc.close();
	}

}
