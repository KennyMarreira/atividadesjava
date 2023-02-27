package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student std = new Student();
		
		System.out.print("Name: ");
		std.name = sc.nextLine();
		
		System.out.println("Notas: ");
		std.nota1 = sc.nextDouble();
		std.nota2 = sc.nextDouble();
		std.nota3 = sc.nextDouble();
		
		System.out.printf("Final grade = %.2f%n", std.finalGrade());
		if (std.finalGrade() >= 60) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			double miss = 60 - std.finalGrade();
			System.out.printf("Missing %.2f points", miss);
		}
		
		
		sc.close();
	}

}
