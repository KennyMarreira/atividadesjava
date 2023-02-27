package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor: ");
		int n = sc.nextInt();
		int [] vect = new int [n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		int somaPares = 0;
		int contPares = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				somaPares += vect[i];
				contPares += 1;
			}
		}
		
		if (contPares == 0) {
			System.out.println("Nenhum numero Par");
		}
		else {
			double media = (double)somaPares / contPares;
			System.out.printf("Media do Pares: %.1f", media);
		}
		
		
		sc.close();
	}

}
