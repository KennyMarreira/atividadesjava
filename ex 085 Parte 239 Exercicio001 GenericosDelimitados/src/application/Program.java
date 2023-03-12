package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product> prod = new ArrayList<>();
		
		String path = "C:\\temp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while (line != null) {
				String [] fields = line.split(",");
				String name = fields[0];
				Double price = Double.parseDouble(fields[1]);
				
				prod.add(new Product(name, price));
				line = br.readLine();
			}
			Product x = CalculationService.max(prod);
			System.out.println("Most expensive:");
			System.out.println(x);
		}
		catch (IOException e) {
			System.out.println("Error " + e.getMessage());
		}
		
	}

}
