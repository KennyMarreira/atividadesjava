package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Digite o diretorio: ");
		String path = sc.nextLine();
		
		File arquivoOrigem = new File(path);
		String pastaOrigem = arquivoOrigem.getParent();
		
		boolean success = new File(pastaOrigem + "\\out").mkdir();
		
		String arquivoCriado = pastaOrigem + "\\out\\summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while (line != null) {
				String [] vect = line.split(",");
				String nome = vect[0];
				double preco = Double.parseDouble(vect[1]);
				int quantidade = Integer.parseInt(vect[2]);
				
				list.add(new Product(nome, preco, quantidade));
				
				System.out.println(line);
				line = br.readLine();
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoCriado))) {
				for (Product item : list) {
					bw.write(item.getNome() + ", " + String.format("%.2f", item.valorTotal()));
					bw.newLine();
				}
				System.out.println(arquivoCriado + " Criado");
			}
			catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println(list);
		
		sc.close();
	}

}
