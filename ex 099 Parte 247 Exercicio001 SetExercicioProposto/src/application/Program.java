package application;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> a = new TreeSet<>();
		Set<Integer> b = new TreeSet<>();
		Set<Integer> c = new TreeSet<>();
		
		System.out.print("How many students for course A? ");
		int courseA = sc.nextInt();
		for (int i = 0; i < courseA; i++) {
			int user = sc.nextInt();
			a.add(user);
		}
		
		System.out.print("How many students for course B? ");
		int courseB = sc.nextInt();
		for (int i = 0; i < courseB; i++) {
			int user = sc.nextInt();
			b.add(user);
		}
		
		System.out.print("How many students for course C? ");
		int courseC = sc.nextInt();
		for (int i = 0; i < courseC; i++) {
			int user = sc.nextInt();
			c.add(user);
		}
		
		Set<Integer> d = new TreeSet<>(a);
		d.addAll(b);
		
		Set<Integer> e = new TreeSet<>(d);
		e.addAll(c);
		
		System.out.print("Total Students: " + e.size());
		
		sc.close();
	}

}
