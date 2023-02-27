import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n;
		double valor1, valor2, valor3, mediaPonderada;
		
		System.out.print("Digite a quantidade de medias: ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			valor1 = sc.nextDouble();
			valor2 = sc.nextDouble();
			valor3 = sc.nextDouble();
			mediaPonderada = ((valor1 * 2.0 + valor2 * 3.0 + valor3 * 5.0)/10);
			System.out.printf("%.1f%n", mediaPonderada);
		}
		
		
		sc.close();
	}

}
