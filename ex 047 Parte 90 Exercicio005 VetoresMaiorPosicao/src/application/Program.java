package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros vai digitar: ");
		int n = sc.nextInt();
		double [] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		double maior = 0;
		int posicaoMaior = 0;
		for (int i = 0; i < vect.length; i++) {
			if(vect[i] > maior) {
				maior = vect[i];
				posicaoMaior = i;
			}
		}
		
		System.out.printf("Maior valor: %.1f%n", maior);
		System.out.printf("Posição do maior valor: %d%n", posicaoMaior);
		
		sc.close();
	}

}
