import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero do Fatorial: ");
		int n = sc.nextInt();

		int fat = 1;
		for (int i = 1; i <= n; i++) {
			fat = fat * i;
		}
		System.out.println(fat);

		sc.close();
	}

}
