import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, numerador, denominador;
		
		System.out.print("Digite a quantiadde de divisões: ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			numerador = sc.nextInt();
			denominador = sc.nextInt();
			
			if (denominador == 0) {
				System.out.println("Divisao impossivel");
			}
			else {
				double divisao = (double) numerador / denominador;
				System.out.printf("%.1f%n", divisao);
			}
		}
		
		
		
		sc.close();
	}

}
