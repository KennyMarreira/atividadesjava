import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero de linhas: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			int quad = i * i;
			int cubo = i * i * i;
			System.out.printf("%d %d %d%n", i, quad, cubo);
		}
		
				
		
		
		sc.close();
	}

}
