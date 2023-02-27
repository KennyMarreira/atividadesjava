package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Quantos empregados serão registrados: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.println("Id já registrado! Tente novamente: ");
				id = sc.nextInt();
			}
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			
			Employee emp = new Employee(id, nome, salario);
			list.add(emp);
			
		}
		
		System.out.print("Qual o id do funcionario que vai receber aumento: ");
		int idsalario = sc.nextInt();
		Integer pos = position(list, idsalario);
		if (pos == null) {
			System.out.println("Esse id não existe!");
		}
		else {
			System.out.print("Digite o aumento: ");
			double aumento = sc.nextDouble();
			list.get(pos).getAumento(aumento);
		}
		
		System.out.println();
		System.out.println("Lista de empregados: ");
		for (Employee emp : list) {
			System.out.println(emp);
		}
		
		sc.close();
	}
	
	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	

}
