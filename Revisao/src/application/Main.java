package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o numero de linhas: ");
		int m = sc.nextInt();
		System.out.print("Digite o numero de colunas: ");
		int n = sc.nextInt();

		int[][] mat = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int x = sc.nextInt();
				mat[i][j] = x;
			}
		}
		System.out.print("Digite um numero da matriz: ");
		int num = sc.nextInt();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] == num) {
					System.out.printf("Posição: %d, %d%n", i, j);
					if (j - 1 >= 0) {
						System.out.printf("Esquerda: %d%n", mat[i][j - 1]);
					}
					if (i - 1 >= 0) {
						System.out.printf("Cima: %d%n", mat[i - 1][j]);
					}
					if (j < n - 1) {
						System.out.printf("Direita: %d%n", mat[i][j + 1]);
					}
					if (i < m - 1) {
						System.out.printf("Baixo: %d%n", mat[i + 1][j]);
					}

				}
			}
		}

		sc.close();
	}
}
