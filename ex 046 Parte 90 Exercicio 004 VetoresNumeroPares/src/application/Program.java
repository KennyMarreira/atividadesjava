package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar: ");
		int n = sc.nextInt();
		int [] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("Numeros Pares:");
		
		int contPares = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				System.out.printf("%d ", vect[i]);
				contPares += 1;
			}
		}
		
		System.out.printf("%nQuantidade de Pares = %d", contPares);
		
		sc.close();
	}

}
