package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o numero de linhas: ");
		int n = sc.nextInt();
		System.out.print("Digite o numero de colunas: ");
		int m = sc.nextInt();
		
		int [][] mat = new int [n][m];
		
		System.out.println("Digite:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Digite o numero que deseja procurar: ");
		int num = sc.nextInt();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == num) {
					System.out.printf("Position %d, %d%n", i, j);
					if (i - 1 >= 0) {
						System.out.printf("Up: %d%n", mat[i-1][j]);
					}
					if (j - 1 >= 0) {
						System.out.printf("Left: %d%n", mat[i][j-1]);
					}
					if (j + 1 <= mat.length) {
						System.out.printf("Right: %d%n", mat[i][j+1]);
					}
					if (i + 1 <= mat[i].length) {
						System.out.printf("Down: %d%n", mat[i+1][j]);
					}
				}
			}
		}
		
		
		
		sc.close();
	}
	
		

}
