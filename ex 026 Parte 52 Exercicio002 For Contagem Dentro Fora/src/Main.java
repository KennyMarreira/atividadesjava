import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n, x, in, out;
		in = 0;
		out = 0;
		
		System.out.println("Digite a quantidade de numeros: ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i = i + 1) {
			x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in += 1;
			}
			else {
				out += 1;
			}
			
		}
		System.out.printf("%d in%n%d out", in, out);
		
		sc.close();
	}

}
