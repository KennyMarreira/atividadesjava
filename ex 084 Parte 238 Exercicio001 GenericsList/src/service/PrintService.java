package service;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	
	private List<T> ps = new ArrayList<>();
	

	public void addValue(T value) {
		ps.add(value);
	}
	
	public T first() {
		if (ps.isEmpty()) {
			throw new IllegalStateException("List is empty!");
		}
		return ps.get(0);
	}
	
	public void print() {
		System.out.print("[");
		if (!ps.isEmpty()) {
			System.out.print(ps.get(0));
		}
		for (int i = 1; i < ps.size(); i++) {
			System.out.print(", " + ps.get(i));
		}
		System.out.println("]");
	}

}
