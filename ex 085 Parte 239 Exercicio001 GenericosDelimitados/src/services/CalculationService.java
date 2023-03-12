package services;

import java.util.List;

public class CalculationService {
	
	public static <T extends Comparable<T>> T max(List<T> prod) {
		if (prod.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		T max = prod.get(0);
		for (T price : prod) {
			if (price.compareTo(max) > 0) {
				max = price;
			}
		}
		return max;
	}
	
}
