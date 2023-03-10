package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross salary: $ ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: $ ");
		emp.tax = sc.nextDouble();
		
		System.out.println(emp.name + ", $ " + String.format("%.2f",emp.netSalary()));
		
		System.out.print("Which percentage to increase salary? ");
		
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.printf("Updated data: %s, $ %.2f%n", emp.name, emp.increaseSalary(percentage));
		
		
		sc.close();
	}

}
