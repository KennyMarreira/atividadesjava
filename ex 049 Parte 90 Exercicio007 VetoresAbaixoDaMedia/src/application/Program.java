package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor: ");
		int n = sc.nextInt();
		double [] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		double somaNum = 0;
		for (int i = 0; i < vect.length; i++) {
			somaNum += vect[i];
		}
		
		double media = somaNum / Double.valueOf(n);
		
		System.out.printf("Media do Vetor: %.3f%n", media);
		
		System.out.println("Elementos abaixo da media:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < media) {
				System.out.println(vect[i]);
			}
		}
		
		
		sc.close();
	}

}
