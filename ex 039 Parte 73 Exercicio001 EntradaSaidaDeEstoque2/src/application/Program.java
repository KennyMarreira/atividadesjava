package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		Product prod = new Product(name, price);

		prod.setName("Computer");
		System.out.println("Updated name: " + prod.getName());
		
		prod.setPrice(1500.00);
		System.out.println("Updated price: " + prod.getPrice());
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		prod.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + prod.toString());
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		prod.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + prod.toString());
		
		
		
		sc.close();
	}

}
