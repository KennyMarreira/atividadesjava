package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle ret = new Rectangle();
		
		System.out.println("Enter Rectangle width and height: ");
		
		ret.width = sc.nextDouble();
		ret.height = sc.nextDouble();
		
		System.out.printf("Area = %.2f%n", ret.area());
		System.out.printf("Perimeter = %.2f%n", ret.perimeter());
		System.out.printf("Diagonal = %.2f%n", ret.diagonal());
		
		
		
		sc.close();
	}

}
