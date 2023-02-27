package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Client> list = new ArrayList<>();
		
		System.out.print("Digite a quantidade de funcionarios: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while (existeId(list, id)) {
				System.out.print("Id ja registrado! Tente novamente: ");
				id = sc.nextInt();
			}
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			
			Client emp = new Client(id, nome, salario);
			list.add(emp);
			
		}
		
		
		System.out.printf("Digite o id do funcionário que vai receber aumento: ");
		int idsalario = sc.nextInt();
		Integer pos = position(list, idsalario);
		if (pos == null) {
			System.out.println("Id não existe!");
		}
		else {
			System.out.print("Digite a porcentagem de aumento: ");
			double aumento = sc.nextDouble();
			list.get(pos).getAumento(aumento);
		}
		
		System.out.println("Lista de empregados:");
		for (Client emp : list) {
			System.out.println(emp);
		}
		
		
		sc.close();
	}
	
	public static Integer position(List<Client> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean existeId(List<Client> list, int id) {
		Client emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	
	

}
