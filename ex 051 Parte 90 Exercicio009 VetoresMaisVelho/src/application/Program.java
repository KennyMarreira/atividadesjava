package application;

import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas vai digitar: ");
		int n = sc.nextInt();
		Pessoa vect[] = new Pessoa[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			vect[i] = new Pessoa(nome, idade);
		}
		
		String nomeVelho = "";
		int idadeVelho = vect[0].getIdade();
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() >= idadeVelho) {
				idadeVelho = vect[i].getIdade();
				nomeVelho = vect[i].getNome();
			}
		}
		System.out.printf("Pessoa mais velha: %s", nomeVelho);
		
		sc.close();
	}

}
