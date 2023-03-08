package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome = "Hello,World,1";
		String [] arrNome = nome.split(",", 3);
		System.out.println(arrNome);
		
		for (String a : arrNome) {
			System.out.print(a);
		}
		sc.close();
	}

}
